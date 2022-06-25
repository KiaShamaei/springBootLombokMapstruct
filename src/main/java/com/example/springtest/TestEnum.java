package com.example.springtest;

import java.util.Arrays;
import java.util.Optional;

public enum TestEnum {
    ENUM1_IOS,
    DEVICE_ET,
    DEVICE_TYPE;

    /**
     *
     * @param value
     * @return
     */
    public static Optional<TestEnum> parseValue(String value){
        return Arrays.stream(values()).filter(x-> x.name().equals(value)).findFirst();
    }
}
