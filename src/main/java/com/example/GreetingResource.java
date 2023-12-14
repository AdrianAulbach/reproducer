package com.example;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import com.example.consumer.Consumer;

@ApplicationScoped
@Path("/hello")
public class GreetingResource {

    @Inject
    Consumer consumer;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return consumer.consumeExampleService();
    }
}