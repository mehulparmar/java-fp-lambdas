package com.demo.lambdas.mr;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReference {

    private static void staticPrintMessage() {
        System.out.println("Static method called");
    }

    private void instancePrintMessage() {
        System.out.println("Instance method called.");
    }

    public static void main(String... args) {

        MethodReference ref = new MethodReference();

        // static method reference
        Thread t = new Thread(MethodReference::staticPrintMessage);
        t.start();

        // instance method reference
        Thread t2 = new Thread(ref::instancePrintMessage);
        t2.start();

        List<String> names = Arrays.asList("Barbara", "James",
                "Mary", "John", "Patricia", "Robert", "Michael ", "Linda");

        // instance method of any arbitrary object
        names.sort(String::compareToIgnoreCase);

        System.out.println(names);

        // constructor reference
        Function<String, Integer> f2 = Integer::new;
        f2.apply("100");

//        Function<String, Integer> f = Integer::new;
//        Integer i = f.apply("100");
//        System.out.println(i);

        // Using an anonymous class
        //        Function<String, Integer> f1 =
        //                new Function<String, Integer>() {
        //                    public Integer apply(String s) {
        //                        return new Integer(s);
        //                    }
        //                };
        //        Integer i1 = f.apply("100");
        //
        //        // Using a lambda expression
        //        Function<String, Integer> f2 = s -> new Integer(s);
        //        Integer i2 = f2.apply("100");


    }


}
