package ru.yandex.practicum;

import io.qameta.allure.Step;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    @Step("Проверка имени для эмбоссирования")
    public boolean checkNameToEmboss() {
        if (name != null) {
            int spaceCount = name.replaceAll("[^ ]", "").length();
            return (name.length() >= 3) && (name.length() <= 19) && ((name.trim()).length() == name.length()) && spaceCount == 1;
        } else return false;
    }
}
