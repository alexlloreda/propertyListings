package io.alex.property.api.resources;

import java.util.Collection;
import java.util.Collections;

import io.alex.property.api.entities.ListingSummary;

public class ListingsImpl implements Listings {

	@Override
	public Collection<ListingSummary> getListings() {
		return Collections.singleton(new ListingSummary());
	}

	@Override
	public ListingSummary getListing(String id) {
		return new ListingSummary();
	}

}
