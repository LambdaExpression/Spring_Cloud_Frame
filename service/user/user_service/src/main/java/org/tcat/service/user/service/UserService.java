package org.tcat.service.user.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService implements UserServiceRemote {

    @Override
    public Boolean test() {
        return false;
    }

}
