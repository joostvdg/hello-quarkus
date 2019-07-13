package com.github.joostvdg.demo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hoi")
public class Hoi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public com.github.joostvdg.demo.model.Hoi hoi() {
        return new com.github.joostvdg.demo.model.Hoi("Hoi");
    }
}
