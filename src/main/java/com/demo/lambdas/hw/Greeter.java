package com.demo.lambdas.hw;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.print();
    }

    public static void main(String... args) {
        Greeter greeter = new Greeter();

        // an concrete implementation of the interface
        HelloWorld helloWorld = new HelloWorld();

        // an anonymous inner class
        Greeting innerClass = new Greeting() {
            @Override
            public void print() {
                System.out.println("Hello World from the inner class");
            }
        };

        // a lambda expression here
        Greeting myGreeting = () -> System.out.println("Hello World from lambda");

        greeter.greet(helloWorld);
        greeter.greet(innerClass);
        greeter.greet(myGreeting);

    }
}