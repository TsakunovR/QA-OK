package tests;

import org.junit.jupiter.api.Test;
import tests.core.BaseTest;
import tests.pages.LoginFormPage;
import tests.pages.MainPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOpenLoginForm extends BaseTest {

    private static final String TARGET_URL = "https://ok.ru";
    private static final String LOGIN = "masClassQA1";
    private static final String PASSWORD = "1234QA";
    private static final String USER_NAME = "masClassQA1 masClassQA1";

    @Test
    public void testOpenLoginForm() {
        goToUrl(TARGET_URL);
        MainPage mainPage = new LoginFormPage(getDriver())
                .setLogin(LOGIN)
                .setPassword(PASSWORD)
                .clickLoginBtn();
        assertEquals(USER_NAME, mainPage.getName(), "Ожидали другое имя пользователя");
    }
}