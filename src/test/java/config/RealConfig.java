package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/realDevice.properties"})
public interface RealConfig extends Config {

    @Key("platformName")
    String platformName();

    @Key("deviceName")
    String deviceName();

    @Key("osVersion")
    String osVersion();

}