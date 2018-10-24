package com.ticomgeo.mstricklin.resource;


import com.ticomgeo.mstricklin.model.City;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("cities")
public interface MyResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<City> message();
}