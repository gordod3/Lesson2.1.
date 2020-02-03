package com.company;

import java.util.Random;

public class Pet {
    int age = generateDefaultAge();
    Color color;
    Shelter shelter;

    private int generateDefaultAge(){
        Random r = new Random();
        return  r.nextInt(20);
    }

    public String getInfo(){
        return "Питомец: \n" +
                "Возраст - " + age + "\n" +
                "Цвет - " + color + "\n" +
                "Приют - " + shelter.getName() + "\n" +
                "Адресс" + shelter.getAddress();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
}
