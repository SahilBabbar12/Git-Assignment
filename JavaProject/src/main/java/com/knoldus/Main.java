package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Person person = new Person("sahil",23);
        
        System.out.println("name: "+person.getName());
        System.out.println("age: "+person.getAge());

        // if(person.checkAge()) previous typo mistake.
        
        if(person.isPersonAdult())
            System.out.println("person is adult");
        else
            System.out.println("Person is not adult");
    }
}
