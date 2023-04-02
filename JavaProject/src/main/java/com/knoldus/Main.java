package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=input.next();
        System.out.println("Enter the age");
        Integer age= input.nextInt();

        Person person =new Person(name,age);
        System.out.println("name: "+person.getName());
        System.out.println("age: "+person.getAge());


        if(person.isPersonAdult())
            System.out.println("person is adult");
        else
            System.out.println("Person is not adult");
    }
}