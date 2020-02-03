package com.company;

public class Main {

    public  static void dog(Dog name, int num, String voice){
        System.out.println(name.getInfo());
        name.makeVoice(num, voice);
        name.makeVoice(voice);
        name.makeVoice(voice, num);
    }

    public static void main(String[] args) {
        Dog sparky = new Dog("Спарки", "дворняга", Color.BLACK, new Shelter("Святой Марии", "пересечение Горького и Манаса"));
        Dog sharik = new Dog("Шарик", "овчарка", Color.GREY, new Shelter("Приют бабули Грей", "песечение Чуя и советской"), "Сидеть");
        Dog robik = new Dog();
        dog(sparky, 2, "wow");
        dog(sharik, 2, "wo-o-ow");
        dog(robik, 4, "w-o-w");

    }
}
