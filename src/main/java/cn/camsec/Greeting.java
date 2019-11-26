/**
 * File : Greeting.java
 * Copyright (C) 2008-2018 www.oneapm.com . all rights reserved.
 */
package cn.camsec;

/**
 * @author : Ron
 * date :2019/11/26:13:12
 * TODO
 * version 1.0
 */
public class Greeting implements GreetingMBean {

    @Override
    public String greeting(String name) {
        return "Hello," + name;
    }

}
