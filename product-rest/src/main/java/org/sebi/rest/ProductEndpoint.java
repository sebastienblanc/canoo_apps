package org.sebi.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/products")
public class ProductEndpoint {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> doGet() {
		return Arrays.asList("iPad","iPod","iPhone");
	}
}