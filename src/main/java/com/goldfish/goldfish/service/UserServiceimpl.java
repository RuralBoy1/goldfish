package com.goldfish.goldfish.service;
import com.goldfish.goldfish.entity.UserInfo;
import com.goldfish.goldfish.dao.UserDao;
import com.goldfish.goldfish.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userservice")
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDao userdao;


    public int insertUser(UserInfo userinfo) {
        return userdao.insertUser(userinfo);
    }

    public UserInfo selectUser(String userId,String userPassword) {

        return userdao.selectUser(userId, userPassword);
    }
    public UserInfo updateUser(UserInfo userinfo) {

        return userdao.updateUser(userinfo);

    }
    public int deleteUser(String userId){
        return userdao.deleteUser(userId);
    }
    public List<UserInfo> selectAllUser(){
        return userdao.selectAllUser();
    }
}
