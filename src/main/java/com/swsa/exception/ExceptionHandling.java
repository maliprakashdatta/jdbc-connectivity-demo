package com.swsa.exception;

public class ExceptionHandling {

    // Static inner classes for custom exceptions
    public static class NotFoundException extends RuntimeException {
        public NotFoundException(String message) {
            super(message);
        }

        public NotFoundException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static class InvalidException extends RuntimeException {
        public InvalidException(String message) {
            super(message);
        }

        public InvalidException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static class MenuNotInStockException extends RuntimeException {
        public MenuNotInStockException(String message) {
            super(message);
        }

        public MenuNotInStockException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    // Example methods to demonstrate usage of custom exceptions
    public void checkResource(boolean condition) {
        if (condition) {
            throw new NotFoundException("Resource not found");
        }
    }

    public void validateInput(String input) {
        if (input == null || input.isEmpty()) {
            throw new InvalidException("Invalid input data");
        }
    }

    public void checkMenuStock(boolean inStock) {
        if (!inStock) {
            throw new MenuNotInStockException("Menu item is out of stock");
        }
    }

    public static void main(String[] args) {
        ExceptionHandling handler = new ExceptionHandling();

        // Example usage of the methods
        try {
            handler.checkResource(true);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            handler.validateInput("");
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }

        try {
            handler.checkMenuStock(false);
        } catch (MenuNotInStockException e) {
            System.out.println(e.getMessage());
        }
    }
}