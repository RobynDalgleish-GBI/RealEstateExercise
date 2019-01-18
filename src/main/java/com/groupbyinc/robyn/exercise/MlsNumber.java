package com.groupbyinc.robyn.exercise;

import lombok.Value;

@Value
class MlsNumber {

    private String value;

    private MlsNumber(String value) {
        if (!isValidMlsNumber(value)) {
            throw new IllegalArgumentException(value + " is not a valid MLS number");
        }
        this.value = value;
    }

    static MlsNumber of(String value) {
        return new MlsNumber(value);
    }

    private boolean isValidMlsNumber(String string) {
        return string != null && string.matches("[A-Z][0-9]{6}");
    }
}
