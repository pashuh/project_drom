package tests.Web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Authorization tests")
public class AuthorizationTest extends TestBase {

    @Test
    @DisplayName("user authorization")
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
