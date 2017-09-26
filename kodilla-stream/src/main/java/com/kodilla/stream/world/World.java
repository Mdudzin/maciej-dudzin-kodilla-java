package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }
    public boolean removeContinent(Continent continent) {
        return continents.remove(continent);
    }
    public BigInteger getPeopleQuantity() {
        return continents.stream()
                .flatMap(c -> c.getList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));
    }
}