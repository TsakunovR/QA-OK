package tests;

import org.junit.jupiter.api.Test;
import tests.core.BaseTest;
import tests.pages.LoginFormPage;

public class TestOpenLoginForm extends BaseTest {

    private String TARGET_URL = "https://ok.ru";

    @Test
    public void testOpenLoginForm() {
        goToUrl(TARGET_URL);
        LoginFormPage loginFormPage = new LoginFormPage(getDriver());
        loginFormPage.setLogin("okokok");
        loginFormPage.setPassword("okokok");
    }
}