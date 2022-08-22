package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AuthPage;

public class AuthTest extends TestBase {
    AuthPage auth = new AuthPage();

    @Test
    @DisplayName("user authorization")
    @Tag("UI")
    void authTestUI() {
        auth.openPage()
                .authUI()
                .assertAuthUI();
    }
}
