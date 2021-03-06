package org.tcat.service.user.domain.user.dao;


import org.tcat.service.user.domain.user.entity.UserPo;

public interface UserPoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPo record);

    int insertSelective(UserPo record);

    UserPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPo record);

    int updateByPrimaryKey(UserPo record);
}