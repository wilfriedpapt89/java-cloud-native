package com.devfest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Devfest 2022";
    }

    @GET
    @Path("/city/{city}")
    @Produces(MediaType.TEXT_PLAIN)
    public String devfest(@PathParam(value = "city") String city) {
        return "Devfest " + city ;
    }
}