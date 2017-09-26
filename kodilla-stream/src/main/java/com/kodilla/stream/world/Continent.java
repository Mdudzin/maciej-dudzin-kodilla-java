package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> countries = new ArrayList<>();

    public void addCountry(Country country) {
        countries.add(country);
    }
    public boolean removeCountry(Country country) {
        return countries.remove(country);
    }
    public List<Country> getList() {
        return countries;
    }

    public BigInteger getPeopleQuantity() {
        return countries.stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));
    }
}