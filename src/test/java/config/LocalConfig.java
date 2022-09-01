package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/local.properties")
public interface LocalConfig extends Config {
    @Key("platformNameEm")
    String platformNameEm();

    @Key("deviceNameEm")
    String deviceNameEm();

    @Key("osVersionEm")
    String osVersionEm();

    String password();
}