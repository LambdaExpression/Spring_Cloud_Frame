package org.tcat.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.tcat.JunitBaseTest;
import org.tcat.service.user.dto.UserDTO;
import org.tcat.service.user.service.UserServiceRemote;

public class TestUserService extends JunitBaseTest {

    @Autowired
    private UserServiceRemote userService;

    @Test
    public void test_create() {
        UserDTO user = new UserDTO()
                .setAccount("account")
                .setPassword("password");
        show(userService.create(user));
    }


}
