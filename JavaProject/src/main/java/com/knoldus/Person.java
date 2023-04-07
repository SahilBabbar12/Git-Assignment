package com.knoldus;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // getters and setters method to get and set the name and age of person.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /* method that either returns true or false indicating whether age is greater than 18 or not.
       boolean checkAge(){ previous typo mistake. */
    
    // method that returns true or false indicating whether person is adult or not.
    boolean isPersonAdult(){

        if(age>=18){
            return true;
        }
        else
            return false;
    }

}


