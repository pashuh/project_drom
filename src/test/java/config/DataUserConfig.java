package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/datauser.properties")
public interface DataUserConfig extends Config{
    String login();
    String password();
}
