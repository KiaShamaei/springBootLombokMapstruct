package com.example.springtest.customeAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class FirstNameConstraint implements ConstraintValidator<FirstNameValid , String>   {
    public boolean isValid(String s, ConstraintValidatorContext cvc) {

        boolean result=s.contains("kia");
        return result;
    }
}
