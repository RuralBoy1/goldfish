package com.goldfish.goldfish.service;

import com.goldfish.goldfish.entity.AdminInfo;
import org.springframework.stereotype.Service;


public interface AdminService {
    public AdminInfo selectAdmin(AdminInfo adminInfo);
}
