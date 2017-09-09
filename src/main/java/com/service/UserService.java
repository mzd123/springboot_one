package com.service;

import com.bean.MyResult;
import com.bean.User;
import com.dao.UserDao;
import com.github.pagehelper.PageHelper;
import com.utils.GetMyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/27.
 */
@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public MyResult selectAllMessage(String aid, String aname, String asex) {
        User user = null;
        List<User> list = userDao.selectUserByuserid(aid, aname, asex);
        PageHelper.startPage(1, 1);
        if (list != null && list.size() > 0) {
            user = list.get(0);
        }
        System.out.println(user.getAid() + "  " + user.getAname() + "  " + user.getAsex());
        if (user == null || !(user.getAid().equals(aid)) || !(user.getAname().equals(aname)) || !(user.getAsex().equals(asex))) {
            return GetMyResult.getResult(false, null, null, "id和name不一致");
        }
        return GetMyResult.getResult(true, aid, aname, null);
    }
}
