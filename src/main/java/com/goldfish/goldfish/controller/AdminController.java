package com.goldfish.goldfish.controller;

import com.goldfish.goldfish.entity.AdminInfo;
import com.goldfish.goldfish.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminservice;

    @RequestMapping("/adminLogin")
    public String adminLogin(){
        return "adminLogin";
    }

    @RequestMapping("/admindoLogin")
    public String admindoLogin(AdminInfo adminInfo,HttpServletResponse response){
        AdminInfo ai=adminservice.selectAdmin(adminInfo);
        if(ai!=null) {
            return "adminLMaster";
        }
        else {
            try {
                response.setContentType("text/html;charset=UTF-8");
                PrintWriter out ;
                out= response.getWriter();
                out.print("<script>alert('账号或密码错误!!');</script>");
                out.flush();
            }
            catch (Exception e){};

            return "redirect:/adminLogin";
        }
    }
}
