package com.rwt.demo.validation.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FieldNotEmptyValidator implements ConstraintValidator<FieldNotEmpty, Object> {

    @Override
    public void initialize(FieldNotEmpty constraintAnnotation) {
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return (value != null && !value.toString().trim().isEmpty());
    }

}