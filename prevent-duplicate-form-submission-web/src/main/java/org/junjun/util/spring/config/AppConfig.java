package org.junjun.util.spring.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "org.junjun.util.spring" })
@EnableCaching
public class AppConfig {

}
