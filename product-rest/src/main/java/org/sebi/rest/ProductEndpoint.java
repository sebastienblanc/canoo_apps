package org.sebi.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/products")
public class ProductEndpoint {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok(Arrays.asList("iPad","iPod","iPhone")).build();
	}
}