package com.automated.basepage.context;

import java.util.HashMap;
import java.util.Map;

import static java.lang.ThreadLocal.withInitial;

public enum Context {
    CONTEXT;

    private final ThreadLocal<Map<String, Object>> testContexts = withInitial(HashMap::new);

    public <T> T get(String data){
        return (T) testContexts.get()
                .get(data);
    }

    public <T> T set(String data, T object){
        testContexts.get()
                .put(data, object);
        return object;
    }

    public void reset(){
        testContexts.get()
                .clear();
    }

}
