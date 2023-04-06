package com.nhr.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.nhr.boot.bean.Car;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Import({DBHelper.class})
@Configuration(proxyBeanMethods = false)
@ImportResource("classpath:bean.xml")
@EnableConfigurationProperties(Car.class)
public class MyConfig {



}
