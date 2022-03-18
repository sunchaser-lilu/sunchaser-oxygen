package com.sunchaser.oxygen.configure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * SpringBoot配置属性 启动器
 *
 * @author sunchaser admin@lilu.org.cn
 * @since JDK8 2022/3/13
 */
@SpringBootApplication
public class ConfigureApplication {
    public static void main(String[] args) {
        // SpringApplication.run(ConfigureApplication.class, args);
        new SpringApplicationBuilder(ConfigureApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args); // 添加临时参数args
    }
}
