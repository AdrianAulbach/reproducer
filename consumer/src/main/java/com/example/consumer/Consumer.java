package com.example.consumer;

import com.example.commons.api.ExampleService;
import com.example.commons.api.*;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Singleton;

@ApplicationScoped
public class Consumer {
    @Inject
    ExampleService exampleService;


    public String consumeExampleService() {
        return exampleService.foo();
    }
}
