package com.ticomgeo.mstricklin.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.Instant;

@Path("msg")
public class AnotherResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String message() {
		return Instant.now().toString()+"\n";
	}
}