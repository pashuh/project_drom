package tests.Ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AuthTest extends TestBase {

    @Test
    @DisplayName("user authorization")
    @Tag("UI")
    void authTestUI() {
        auth.openPageDrom()
                .authUI()
                .assertAuthUI();
    }
}
