package com.bridgelabz;

public class CompanyEmpWage {
        int wagePrHr, maxHr, maxDay, empMonthlyWages;
        String companyName;
        //CONSTRUCTOR
        public CompanyEmpWage(String companyName, int wagePrHr, int maxHr, int maxDay) {
            this.companyName = companyName;
            this.wagePrHr = wagePrHr;
            this.maxHr = maxHr;
            this.maxDay = maxDay;
        }
    }