package com.groupbyinc.robyn.exercise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ListingTest {

    @Test
    @DisplayName("Throws IllegalArgumentException when an invalid MLS number is specified.")
    void throwsIllegalArgumentExceptionWhenInvalidMlsNumberIsPassed() {
        String mlsNumber = "123";
        assertThatThrownBy(() -> new Listing(mlsNumber, "Robyn's Apartment"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining(mlsNumber)
            .hasMessageContaining("not a valid MLS number");
    }
}
