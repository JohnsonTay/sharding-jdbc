package com.cly.sharding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.SimpleCommandLinePropertySource;

/**
 * @Filename ShardingJdbcMain.java
 * @Description
 * @version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/1 17:39</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@SpringBootApplication
@PropertySource("${config.file:classpath:config.properties}")
public class ShardingJdbcMain extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(ShardingJdbcMain.class);

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(ShardingJdbcMain.class);
        SimpleCommandLinePropertySource source = new SimpleCommandLinePropertySource(args);
        app.setAdditionalProfiles(getDefaultProfile(source));
        app.run(args);
    }


    private static String getDefaultProfile(SimpleCommandLinePropertySource source) {
        if (source.containsProperty("spring.profiles.active")) {
            logger.info("Running with Spring profile(s) : {}", source.getProperty("spring.profiles.active"));
            return source.getProperty("spring.profiles.active");
        }

        logger.warn("No Spring profile configured, running with default configuration: local.");
        return "local";
    }
}
