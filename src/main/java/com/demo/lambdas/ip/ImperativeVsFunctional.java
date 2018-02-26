package com.demo.lambdas.ip;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

import java.util.List;

public class ImperativeVsFunctional {

    public static void main(String... args) {

        List<IncomeList> incomeList = IncomeListHelper.getIncomeList();

        // Get the sum of all incomes from income list grouped by gender

        // imperative
        int totalIncomeFemale = 0;
        int totalIncomeMale = 0;

        for(int i = 0 ; i < incomeList.size(); i++) {

            IncomeList il = incomeList.get(i);

            if(il.getGender().equals("M")) {
                totalIncomeMale += il.getIncome();
            }
            else if(il.getGender().equals("F")) {
                totalIncomeFemale += il.getIncome();
            }
        }

        System.out.println("F=" + totalIncomeFemale);
        System.out.println("M=" + totalIncomeMale);

        // declarative in SQL
        // select gender, sum(income) from income_list group by gender;

        // functional in java
        incomeList
            .stream()
            .collect(groupingBy(IncomeList::getGender, summingInt(IncomeList::getIncome)))
            .entrySet()
            .forEach(System.out::println);
    }
}