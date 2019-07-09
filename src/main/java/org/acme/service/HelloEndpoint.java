package org.acme.service;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RequestScoped
@Path("/test")
public class HelloEndpoint {

    @GET
    @Path("/hello")
    public String hello()
    {
        return "Zello!!!";
    }
}
