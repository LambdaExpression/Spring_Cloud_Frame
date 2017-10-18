package org.tcat.service.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tcat.parent.commons.base.BeansConverter;
import org.tcat.service.user.domain.user.dao.UserPoMapper;
import org.tcat.service.user.domain.user.entity.UserPo;
import org.tcat.service.user.dto.UserDTO;

@RestController
public class UserService implements UserServiceRemote {

    @Autowired
    private UserPoMapper userPoMapper;

    @Override
    public Integer create(@RequestBody UserDTO user) {
        if (user == null) {
            return 0;
        }
        UserPo userPo = BeansConverter.copy(user, UserPo.class);
        return userPoMapper.insertSelective(userPo);
    }

    @Override
    public Integer deleteById(Integer id) {
        if (id == null) {
            return 0;
        }
        return userPoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(Integer id, UserDTO user) {
        if (id == null || user == null) {
            return 0;
        }
        user.setId(id);
        return userPoMapper.updateByPrimaryKeySelective(BeansConverter.copy(user, UserPo.class));
    }

    @Override
    public UserDTO getOne(Integer id) {
        if (id == null) {
            return null;
        }
        return BeansConverter.copy(userPoMapper.selectByPrimaryKey(id), UserDTO.class);
    }

}
