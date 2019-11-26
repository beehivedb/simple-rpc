/**
 * File : GreetingMBean.java
 * Copyright (C) 2008-2018 www.oneapm.com . all rights reserved.
 */
package cn.camsec;

import java.io.Serializable;

/**
 * @author Ron
 * date 2019/11/26
 * TODO
 * version 1.0
 */
public interface GreetingMBean extends Serializable {
    String greeting(String name);
}
