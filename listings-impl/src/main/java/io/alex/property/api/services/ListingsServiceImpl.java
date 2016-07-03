package io.alex.property.api.services;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import java.util.concurrent.CompletableFuture;

/**
 * Created by alex on 3/07/2016.
 */
public class ListingsServiceImpl implements ListingsService {
    @Override
    public ServiceCall<NotUsed, String> hello(String id) {
        return request -> CompletableFuture.completedFuture("Hello" + id);
    }
}
