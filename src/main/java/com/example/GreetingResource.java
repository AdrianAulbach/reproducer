package com.example;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
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