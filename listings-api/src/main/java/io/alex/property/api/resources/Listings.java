package io.alex.property.api.resources;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import io.alex.property.api.entities.ListingSummary;

/**
 * Created by alex on 27/06/2016.
 */
@Path("/listings")
public interface Listings {

    @GET Collection<ListingSummary> getListings();

    @GET
    @Path("/${id}")
    ListingSummary getListing(@PathParam("${id}") String id);
    	
}
