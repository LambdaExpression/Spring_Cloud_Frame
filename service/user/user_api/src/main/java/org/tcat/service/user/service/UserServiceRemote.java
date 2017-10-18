package org.tcat.service.user.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.tcat.service.user.dto.UserDTO;


@FeignClient(name = "user-service")
public interface UserServiceRemote {

    @PostMapping("create")
    Integer create(@RequestBody UserDTO user);

    @PostMapping("deleteById")
    Integer deleteById(Integer id);

    @PostMapping("update")
    Integer update(@RequestParam("id") Integer id, @RequestParam("user") UserDTO user);

    @PostMapping("getOne")
    UserDTO getOne(Integer id);

}
