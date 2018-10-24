package com.ticomgeo.mstricklin.resource;

import com.ticomgeo.mstricklin.model.City;
import com.ticomgeo.mstricklin.service.CityService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class MyResourceImpl implements MyResource {
    @Inject
    private CityService cityService;

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<City> message() {

        List<City> cities = cityService.findAll();

        return cities;
    }
}