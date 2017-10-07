package org.tcat.service.user.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableFeignClients(basePackages = "org.tcat.service.*.service")
public class FeignConfigurer {
}
