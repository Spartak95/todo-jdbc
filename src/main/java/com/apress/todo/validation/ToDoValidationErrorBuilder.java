package com.apress.todo.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

public class ToDoValidationErrorBuilder {

    private ToDoValidationErrorBuilder() {

    }

    public static ToDoValidationError fromBindingErrors(Errors errors) {
        ToDoValidationError error = new ToDoValidationError("Validation failed. " +
                                                                errors.getErrorCount() + " error(s)");

        for (ObjectError objectError : errors.getGlobalErrors()) {
            error.addValidationError(objectError.getDefaultMessage());
        }

        return error;
    }
}
