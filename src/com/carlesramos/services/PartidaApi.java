package com.carlesramos.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.server.ResourceConfig;

@Path("/inicio")
public class PartidaApi extends ResourceConfig{
	
	@GET
	@Path("/saluda")
	public String saluda() {
		return "Bienvenido!!";
	}
	
}
