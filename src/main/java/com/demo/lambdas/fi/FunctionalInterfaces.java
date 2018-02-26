package com.demo.lambdas.fi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        // Consumer
        Consumer<String> consumer = (String s) -> printString(s);
        consumer.accept("Consumer Interface");

        // Supplier
        Supplier<String> supplier = () -> "Supplier Interface";
        System.out.println(supplier.get());

        // Predicate
        Predicate<Integer> predicate = i -> i > 10;
        System.out.println(predicate.test(5));

        Function<String, String>  function = s -> s.concat("World!") ;
        System.out.println(function.apply("Functional "));

//        IntConsumer intConsumer = System.out::println;
//        intConsumer.accept(2000);
    }

    private static void printString(String str) {
        System.out.println(str);
    }
}