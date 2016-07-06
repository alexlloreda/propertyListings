package io.alex.property.api.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.annotation.concurrent.Immutable;
import java.util.Objects;

/**
 * Created by alex on 5/07/2016.
 */
@JsonDeserialize
@Immutable
public final class Listing {

    public final String address;

    @JsonCreator
    public Listing(String address) {
        this.address = Objects.requireNonNull(address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return o instanceof Listing && equalTo((Listing) o);
    }

    private boolean equalTo(Listing that) {
        return this.address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }
}
