package com.groupbyinc.robyn.exercise;

import lombok.Value;

import java.util.Objects;

@Value
class Listing {

    private MlsNumber mlsNumber;
    private String title;

    Listing(MlsNumber mlsNumber, String title) {
        this.mlsNumber = Objects.requireNonNull(mlsNumber, "Value must not be null");
        this.title = Objects.requireNonNull(title, "Value must not be null");
    }
}
