package com.goldfish.goldfish.service;

import com.goldfish.goldfish.dao.AdminDao;
import com.goldfish.goldfish.entity.AdminInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminservice")
public class AdminServiceImpl implements  AdminService{
    @Autowired
    AdminDao admindao;
    public AdminInfo selectAdmin(AdminInfo adminInfo){
        return admindao.selectAdmin(adminInfo);
    }
}
