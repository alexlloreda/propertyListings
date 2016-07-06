package io.alex.property.api.services;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

/**
 * Created by alex on 4/07/2016.
 */
public class ListingsServiceModule extends AbstractModule implements ServiceGuiceSupport {
    @Override
    protected void configure() {
        bindServices(serviceBinding(ListingsService.class, ListingsServiceImpl.class));
    }
}
