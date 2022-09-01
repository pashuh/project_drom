package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/browserstack.properties")
public interface BrowserStackConfig extends Config {
    @Key("login")
    String login();
    @Key("password")
    String password();
    @Key("app")
    String app();
}


