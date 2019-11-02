package com.qiao.domain;

import java.util.List;
import java.util.Map;

public class PersonBeanAnnotation {
    private String firstName;
    private String lastName;
    private int age;
    private List<String> hobbies;
    private Map<String, String> pets;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getPets() {
        return pets;
    }

    public void setPets(Map<String, String> pets) {
        this.pets = pets;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonBeanAnnotation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                ", pets=" + pets +
                ", email='" + email + '\'' +
                '}';
    }
}
