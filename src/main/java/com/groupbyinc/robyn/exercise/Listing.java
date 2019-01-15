package com.groupbyinc.robyn.exercise;

public class Listing {

    private final String mlsNumber;
    private final String title;
    private final String description;

    public Listing(String mlsNumber, String title) {
        this(mlsNumber, title, "");
    }

    public Listing(String mlsNumber, String title, String description) {
        if (!isValidMlsNumber(mlsNumber)) {
            throw new IllegalArgumentException(mlsNumber + " is not a valid MLS number");
        }
        this.mlsNumber = mlsNumber;
        this.title = title;
        this.description = description;
    }

    public String getMlsNumber() {
        return mlsNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    private boolean isValidMlsNumber(String string) {
        return string != null && string.matches("^(?=.*[A-Z]{1})(?=.*[0-9]{6})[A-Z0-9]+$");
    }
}
