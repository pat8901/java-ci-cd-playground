package com.mycompany.helloworld;

public class HelloWorld {
    String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.setMessage("Welcome to the program!");
    }
}