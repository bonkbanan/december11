package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	/*
      1) Дано клас у которого 5 полей, (id,name, description
      localDate,isActive) потрібно зробити повну адмін панель.
      Базу, Бекенд, crud,
      c-create
      r-read
      u-update
      d-delete
       Максимально показать скил (search, sort, paging, valudation
       tests)


    2) Class company (name,Company boss, количество людей в компании)
    Найти самого верхнего боса,найти сколько человек у компании, и сколько
    человек у каждой подчиняющейся ей компании


    3)Map
    все дание из map - convert to csv
      */


        Company chief = new Company("chief",null,6);
        Company lawyer = new Company("lawyer",chief,2);
        Company accountant = new Company("accountant",lawyer,5);
        Company dev = new Company("developers",chief,3);
        Company grafDesign = new Company("graf design",dev,1);
        Company testers = new Company("testers",dev,5);
        Company uiDesginers = new Company("ui designers",grafDesign,4);
        Company backDev = new Company("back dev",dev,6);
        Company BD = new Company("BD",backDev,4);
        Company devOPS = new Company("dev OPS",backDev,2);
        Company audit = new Company("audit",null,4);


        List<Company> companies = new ArrayList<>(
                Arrays.asList(
                        chief,lawyer,accountant,dev,grafDesign,testers,
                        uiDesginers,backDev,BD,devOPS,audit
                )
        );

        CompanyServiceImpl service = new CompanyServiceImpl();
        Company theTopChief = service.getTopChief(testers,companies);
    }
}
