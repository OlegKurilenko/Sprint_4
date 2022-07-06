package ru.yandex.practicum;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

        int spaceCount = name.replaceAll("[^ ]", "").length();

        return (name.length() >= 3) & (name.length() <= 19) & ((name.trim()).length() == name.length()) & spaceCount == 1;
    }
}
