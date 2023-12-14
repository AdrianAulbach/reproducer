package com.example.consumer;

import com.example.commons.api.ExampleService;
import com.example.commons.api.*;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@ApplicationScoped
public class Consumer {
    @Inject
    ExampleService exampleService;


    public String consumeExampleService() {
        return exampleService.foo();
    }
}
