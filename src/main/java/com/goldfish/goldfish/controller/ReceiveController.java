package com.goldfish.goldfish.controller;

import com.goldfish.goldfish.entity.ReceiveInfo;
import com.goldfish.goldfish.service.ReceiveService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ReceiveController {
    ReceiveService receiveservice;

    @RequestMapping("/selectReveive")
    public void selectReveive(){
        receiveservice.selectReveive();
    }

    @RequestMapping("/insertReceive")
    public String insertReceive(HttpServletRequest request){
        HttpSession session=request.getSession();
        Object obj=session.getAttribute("key0");
        String a=obj.toString();
        int receiveoId=Integer.parseInt(a);
        receiveservice.insertReceive(receiveoId);
        return "insertReceive";
    }

    @RequestMapping("/insertReceive1")
    public String insertReceive1(ReceiveInfo receiveInfo){
        receiveservice.insertReceive1(receiveInfo);
        return "insertReceive1";
    }

}
