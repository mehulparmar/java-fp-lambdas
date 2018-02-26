package com.demo.lambdas.ip;

import java.util.Arrays;
import java.util.List;

public class IncomeListHelper {
    public static List<IncomeList> getIncomeList() {
        return Arrays.asList(
                new IncomeList("John",      "M", 20000),
                new IncomeList("Richard",   "M", 10000),
                new IncomeList("Joe",       "M", 15000),
                new IncomeList("Mary",      "F", 25000),
                new IncomeList("Sarah",     "F",  9000),
                new IncomeList("Kim",       "F", 30000)
        );
    }
}