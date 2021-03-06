package com.santander.prueba3.web.rest.errors;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class InvalidPasswordException extends AbstractThrowableProblem {

    private static final long serialVersionUID = 1L;

    public InvalidPasswordException() {
        this("Incorrect password");
    }

    public InvalidPasswordException(final String message) {
        super(ErrorConstants.INVALID_PASSWORD_TYPE, message, Status.BAD_REQUEST);
    }
}
