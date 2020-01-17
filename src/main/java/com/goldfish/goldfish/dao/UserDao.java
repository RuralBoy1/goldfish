package com.goldfish.goldfish.dao;
import com.goldfish.goldfish.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
        public List<UserInfo> selectAllUser();
        public int insertUser(UserInfo userinfo);
        public UserInfo selectUser(String userId,String userPassword);
        public UserInfo updateUser(UserInfo userinfo);
        public int deleteUser(String userId);
    }



