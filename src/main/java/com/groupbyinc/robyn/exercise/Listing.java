package com.groupbyinc.robyn.exercise;

import lombok.Value;

@Value
public class Listing {

    // String or int is not the good answer! Find out why! Hint: The answer is in my original slack message!
    String mlsNumber;

    String title;
}
