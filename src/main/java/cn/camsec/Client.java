/**
 * File : Client.java
 * Copyright (C) 2008-2018 www.oneapm.com . all rights reserved.
 */
package cn.camsec;

import javax.management.JMX;
import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * @author : Ron
 * date :2019/11/26:13:20
 * TODO
 * version 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException, MalformedObjectNameException {
        //connect JMX
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
        JMXConnector jmxc = JMXConnectorFactory.connect(url,null);
        MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();
        ObjectName on = new ObjectName("jmxBean:name=Greeting");
        GreetingMBean greetingMBean = JMX.newMBeanProxy(mbsc, on, GreetingMBean.class);
        System.out.println(greetingMBean.greeting("Ron"));
    }
}
