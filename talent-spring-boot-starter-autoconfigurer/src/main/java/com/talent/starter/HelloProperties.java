package com.talent.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author guobing
 * @Title: HelloProperties
 * @ProjectName spring-boot-08-starter
 * @Description: TODO
 * @date 2019/1/15下午5:30
 */
@ConfigurationProperties(prefix = "talent.hello")
public class HelloProperties {

    private String prefix;

    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
