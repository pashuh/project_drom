package tests.Web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Авторизация")
public class AuthorizationTest extends TestBase {

    @Test
    @DisplayName("Проверка возможности авторизации")
    @Tag("ui")
    void authorizationTestUI() {
        auth.openPage()
                .openAuthorezation()
                .setLogin()
                .setPassword()
                .clickSubmit()
                .assertAuthUI();
    }
}
