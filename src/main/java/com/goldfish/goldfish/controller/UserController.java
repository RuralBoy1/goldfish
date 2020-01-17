package com.goldfish.goldfish.controller;
import com.goldfish.goldfish.entity.UserInfo;
import com.goldfish.goldfish.service.UserService;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userservice;

    @RequestMapping("/user")
    public String user(){
        return "user";
    }

    @RequestMapping("/userLogin")
    public String login() {
        System.out.print(5);
        return "userLogin";
    }
    @RequestMapping("/userRegist")
    public String regist() {
        return "userRegist";
    }

    @RequestMapping("/dologin")
    public String login(UserInfo userinfo, HttpServletResponse response, Map<String, Object> map, HttpServletRequest request) {
        UserInfo ui = userservice.selectUser(userinfo.getUserId(), userinfo.getUserPassword());
        if (ui == null) {
            try {
                response.setContentType("text/html;charset=UTF-8");
                PrintWriter out ;
                out= response.getWriter();
                out.print("<script>alert('账号或密码错误!!');</script>");
                out.flush();
            }
            catch (Exception e){};
            return "userLogin";
        } else {
            HttpSession session=request.getSession();
            session.setAttribute("key",userinfo.getUserId());
            return "redirect:/selectgoods";

        }
    }

    @RequestMapping("/doregist")
    public String regist(UserInfo userinfo,HttpServletResponse response, Map<String, Object> map) {
        UserInfo ui = userservice.selectUser(userinfo.getUserId(), userinfo.getUserPassword());
        if (ui == null) {
            int u = userservice.insertUser(userinfo);
            if (u != 0) {
                try {
                    response.setContentType("text/html;charset=UTF-8");
                    PrintWriter out ;
                    out= response.getWriter();
                    out.print("<script>alert('注册成功!!');</script>");
                    out.flush();
                }
                catch (Exception e){};
                return "userLogin";
            }
            else{
                try {
                    response.setContentType("text/html;charset=UTF-8");
                    PrintWriter out ;
                    out= response.getWriter();
                    out.print("<script>alert('注册失败!!');</script>");
                    out.flush();
                }
                catch (Exception e){};

                return "userRegist";
            }
        } else {
            try {
                response.setContentType("text/html;charset=UTF-8");
                PrintWriter out ;
                out= response.getWriter();
                out.print("<script>alert('注册失败，账号已存在!!');</script>");
                out.flush();
            }
            catch (Exception e){};
            return "userRegist";
        }
    }
    @RequestMapping("/dodelete")
    public String delete(UserInfo userinfo, Map<String, Object> map){
        int u = userservice.deleteUser(userinfo.getUserId());
        if (u != 0) {
            map.put("msg", "删除成功");
            return "success";
        }
        else{
            map.put("msg", "删除失败");
            return "fail";
        }
    }
    @RequestMapping("/doupdate")
    public String update(UserInfo userinfo, Map<String, Object> map){
        UserInfo ui=userservice.updateUser(userinfo);
        if (ui == null) {
            map.put("msg", "修改信息失败!");
            return "fail";
        } else {
            map.put("msg", "修改信息成功");
            return "success";
        }
    }
    @RequestMapping("selectAllUser")
    public String selectAllUser(Model model){
        List li=userservice.selectAllUser();
        model.addAttribute("li",li);
        return "personal";
    }

}





