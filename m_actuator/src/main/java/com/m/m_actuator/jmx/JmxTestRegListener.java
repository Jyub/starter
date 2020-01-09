package com.m.m_actuator.jmx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.management.*;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2020/1/9 16:11
 * @description: 监听
 */
@Component
public class JmxTestRegListener implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    private JmxTest jmxTest;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        try {
            //创建mbean server
            MBeanServer beanServer = ManagementFactory.getPlatformMBeanServer();
            //创建object name
            ObjectName objectName = new ObjectName("jmxBean:name=testJmx");
            //注册
            beanServer.registerMBean(jmxTest,objectName);
            //注册一个端口，绑定url后，客户端就可以使用rmi通过url方式来连接JMXConnectorServer
            Registry registry = LocateRegistry.createRegistry(1099);
            JMXServiceURL serviceURL = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/jmxrmi");
            //创建jmxConnectorServer
            JMXConnectorServer cs = JMXConnectorServerFactory.newJMXConnectorServer(serviceURL, null, beanServer);
            //启动
            cs.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
