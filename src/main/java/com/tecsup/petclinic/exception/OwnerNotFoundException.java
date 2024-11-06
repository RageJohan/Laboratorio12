package com.tecsup.petclinic.exception;

/**
 * Excepción para el caso en que un Owner no es encontrado.
 *
 */
public class OwnerNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor que acepta un mensaje de error.
     *
     * @param message Mensaje de error
     */
    public OwnerNotFoundException(String message) {
        super(message);
    }
}

