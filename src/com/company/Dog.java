package com.company;

public final class Dog extends Pet {
    String name;
    String breed;
    String commands;

    public Dog() {
        this.name = "Неизвестная собака";
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.color = color;
        super.shelter = shelter;
    }
    public Dog(String name, String breed, Color color, Shelter shelter, String commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.color = color;
        super.shelter = shelter;
    }

    void makeVoice(String voice, int num){
        System.out.println(name + " лает");
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
    }

    void makeVoice(int num, String voice){
        System.out.println(name + " лает");
        for (int i = 0; i < num; i++) {
            System.out.println(voice);
        }
    }

    void makeVoice(String voice){
        System.out.println(name + " лает");
        System.out.println(voice);
    }

    final public String getInfo(){
        if (breed == null){
            return "Ничего не известно.";
        }else if (commands == null){
            return "Питомец: \n" +
                    "Имя - " + name + "\n" +
                    "Порода - " + breed + "\n" +
                    "Возраст - " + age + "\n" +
                    "Цвет - " + color + "\n" +
                    "Приют - " + shelter.getName() + "\n" +
                    "Адресс - " + shelter.getAddress();
        }else return "Питомец: \n" +
                "Имя - " + name + "\n" +
                "Порода - " + breed + "\n" +
                "Возраст - " + age + "\n" +
                "Цвет - " + color + "\n" +
                "Команды - " + commands + "\n" +
                "Приют - " + shelter.getName() + "\n" +
                "Адресс - " + shelter.getAddress();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }
}
