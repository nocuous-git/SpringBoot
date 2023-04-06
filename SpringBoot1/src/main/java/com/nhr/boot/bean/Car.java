package com.nhr.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Objects;

@ConfigurationProperties(prefix = "mycar")
@Data()
@AllArgsConstructor()
@NoArgsConstructor()
public class Car {

    private String brand;

    private Integer price;
}
