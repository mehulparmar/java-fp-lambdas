package com.demo.lambdas.st;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.demo.lambdas.test.unit3.Person;

public class StreamsExample {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Charles", "Dickens", 20),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matt", "Arnold", 39)
        );

        List<Person> newList = persons.stream()
                                      .filter(p -> p.getFirstName().startsWith("C"))
                                      .peek(e -> System.out.println("Start with C : " + e))
                                      .filter(p1 -> p1.getAge() > 30)
                                      .peek(e -> System.out.println("Start with C & above 30: " + e))
                                      .collect(Collectors.toList());

        newList.forEach(System.out::println);
    }
}
