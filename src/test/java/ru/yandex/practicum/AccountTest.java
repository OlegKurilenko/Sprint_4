package ru.yandex.practicum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expected;
    private Account account;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные: Строка - \"{0}\", Результат - \"{1}\"")
    public static Object[][] getParamData() {
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {"ТимотейШевроле", false},
                {"Тимо тейШевр оле", false},
                {" Тимот", false},
                {"Тимот ", false},
                {"Тимот Шаламе ", false},
                {" Тимот Шаламе", false},
                {"Т Ш", true},
                {"Т ", false},
                {"Йцукенгшщзх Фывапролдджэс", false},
                {"ЙцукенгшщзхФывапролдджэс ", false},
                {"1234567890 12345678", true},
                {"   ", false},
                {"", false},
                {null, false},
        };
    }

    @Before
    public void setup() {
        account = new Account(name);
    }

    @Test
    public void testCheckNameToEmboss() {
        account = new Account(name);
        Boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }

}
