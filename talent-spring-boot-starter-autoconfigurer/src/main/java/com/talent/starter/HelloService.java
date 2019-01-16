package com.talent.starter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author guobing
 * @Title: HelloService
 * @ProjectName spring-boot-08-starter
 * @Description: TODO
 * @date 2019/1/15下午5:28
 */
public class HelloService {

    /**
     * 使用setter方法添加到ioc容器
     */
    private HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String name) {
        return helloProperties.getPrefix() + "-" + helloProperties.getSuffix();
    }
}
