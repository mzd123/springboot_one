package com.dao;

import com.bean.User;
import com.bean.UserExample;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/5/27.
 */
@Component
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public List<User> selectUserByuserid(String aid, String aname, String asex) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAidEqualTo(aid);
        criteria.andAsexEqualTo(asex);
        criteria.andAnameEqualTo(aname);
        return userMapper.selectByExample(userExample);
    }
}
