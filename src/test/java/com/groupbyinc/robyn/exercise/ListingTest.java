package com.groupbyinc.robyn.exercise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class ListingTest {

    @ParameterizedTest
    @ValueSource(strings = {"123", "", "EE999999", "ekjbfjvbj93834r+(*^%$#"})
    @DisplayName("Throws IllegalArgumentException when an invalid MLS number is specified.")
    void throwsIllegalArgumentExceptionWhenInvalidMlsNumberIsPassed(String mlsNumber) {
        assertThatThrownBy(() -> new Listing(MlsNumber.of(mlsNumber), "Robyn's Apartment"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining(String.valueOf(mlsNumber))
            .hasMessageContaining("not a valid MLS number");
    }

    @ParameterizedTest
    @ValueSource(strings = {"F123456", "E999999"})
    @DisplayName("Does not throw an exception when valid MLS number is passed.")
    void doesNotThrowAnyException(String mlsNumber) {
        assertThatCode(() -> new Listing(MlsNumber.of(mlsNumber), "title"))
            .doesNotThrowAnyException();
    }
}
