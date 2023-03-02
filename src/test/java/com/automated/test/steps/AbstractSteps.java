package com.automated.test.steps;

import com.automated.basepage.context.Context;

import static com.automated.basepage.context.Context.CONTEXT;

public abstract class AbstractSteps {

    public Context testContext() {
        return CONTEXT;
    }

}
