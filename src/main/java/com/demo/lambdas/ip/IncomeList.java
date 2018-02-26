package com.demo.lambdas.ip;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
@Getter
class IncomeList {
    private String name;
    private String gender;
    private int income;
}
