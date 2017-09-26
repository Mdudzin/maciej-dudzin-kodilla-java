package com.kodilla.stream.world;

import java.math.BigInteger;

public final class Country {

    private final String countryName;
    private final BigInteger peopleQuantity;

    public Country(String countryName, BigInteger peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return countryName.equals(country.countryName);
    }

    @Override
    public int hashCode() {
        return countryName.hashCode();
    }

    public BigInteger getPeopleQuantity() {
        return peopleQuantity;
    }
}