package io.alex.property.api.services;

import static com.lightbend.lagom.javadsl.api.Service.named;
import static com.lightbend.lagom.javadsl.api.Service.pathCall;

import akka.Done;
import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import io.alex.property.api.entities.Listing;

/**
 * Created by alex on 30/06/2016.
 */
public interface ListingsService extends Service {
    /**
     * Example: curl http://localhost:9000/api/hello/Alice
     */
    ServiceCall<NotUsed, String> hello(String id);

    /**
     * Example: curl -H "Content-Type: application/json" -X POST -d '{"message":
     * "Hi"}' http://localhost:9000/api/hello/Alice
     */
    //ServiceCall<GreetingMessage, Done> useGreeting(String id);
    ServiceCall<Listing, Done> createListing();

    @Override
    default Descriptor descriptor() {
        // @formatter:off
        return named("listingsservice").withCalls(
                Service.pathCall("/api/hello/:id", this::hello),
                Service.pathCall("/api/listings", this::createListing)
                //pathCall("/api/hello/:id", this::useGreeting)
        ).withAutoAcl(true);
        // @formatter:on
    }
}
