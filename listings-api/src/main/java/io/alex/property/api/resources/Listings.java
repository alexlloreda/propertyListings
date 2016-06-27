package io.alex.property.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by alex on 27/06/2016.
 */
@Path("/listings")
public interface Listings {

    @GET Collection<ListingSummary> getListings();

    // POST
}
