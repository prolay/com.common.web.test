package com.example.common;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/v1/status")
public class TestService {
	@GET
    @Produces("text/plain")
    public String getHello() {
        return "Hello World!";
    }
}
