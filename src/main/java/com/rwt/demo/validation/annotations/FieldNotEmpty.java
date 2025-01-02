package com.rwt.demo.validation.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Constraint(validatedBy = { FieldNotEmptyValidator.class })
public @interface FieldNotEmpty {

    String message() default "{validation.notEmpty}";

    String field() default "Field";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}