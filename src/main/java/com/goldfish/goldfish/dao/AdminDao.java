package com.goldfish.goldfish.dao;

import com.goldfish.goldfish.entity.AdminInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {

    public AdminInfo selectAdmin(AdminInfo adminInfo);
}
