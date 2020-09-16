package com.consorcio;

import com.consorcio.beans.Location;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/location")
public interface LocationResource {
  @GET
  @Produces("application/json")
  List<Location> generatedMethod1();
}
