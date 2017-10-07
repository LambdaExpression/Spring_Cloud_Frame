package org.tcat.service.user.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("user-service")
public interface UserServiceRemote {

    @GetMapping("userServiceRemote_test")
    Boolean test();

}
