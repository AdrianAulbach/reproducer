package com.example.commons.service;

import com.example.commons.api.ExampleService;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExampleServiceImpl implements ExampleService {

    @Override
    public String foo() {
        return "bar";
    }
}
