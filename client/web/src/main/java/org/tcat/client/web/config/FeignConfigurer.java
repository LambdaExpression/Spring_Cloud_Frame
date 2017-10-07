package org.tcat.client.web.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableFeignClients(basePackages = "org.tcat.service.*.service")
public class FeignConfigurer {
}
