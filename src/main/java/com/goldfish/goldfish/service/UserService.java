package com.goldfish.goldfish.service;
import com.goldfish.goldfish.entity.UserInfo;

import java.util.List;

public interface UserService{
        public List<UserInfo> selectAllUser();
        public int insertUser(UserInfo userinfo);
        public UserInfo selectUser(String userId,String userPassword);
        public UserInfo updateUser(UserInfo userinfo);
        public int deleteUser(String userId);
    }


