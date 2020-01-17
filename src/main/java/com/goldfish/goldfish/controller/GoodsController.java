package com.goldfish.goldfish.controller;

import com.goldfish.goldfish.entity.CartInfo;
import com.goldfish.goldfish.entity.GoodsInfo;
import com.goldfish.goldfish.service.CartService;
import com.goldfish.goldfish.service.GoodsService;
import com.oracle.webservices.internal.api.message.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.ArrayList;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.io.IOException;

@Controller
public class GoodsController {
    @Autowired
    private CartService cartservice;

    @Autowired
    private GoodsService goodsservice;

    @RequestMapping("/meun")
    public String meun(){
        return "meun";
    }

    @RequestMapping("/updateGoods")
    public String insertmeun(@RequestParam(value = "bName")String bName,@RequestParam(value = "bAddres")String bAddres,@RequestParam(value = "bPhone")String bPhone,HttpServletRequest request) {
        HttpSession session=request.getSession();
        Object obj=session.getAttribute("key");
        String bId=obj.toString();
        List<CartInfo> ci=cartservice.selectCart(bId);
        //List<String> cartimages=new ArrayList<>();
        //for(int i=0;i<ci.size();i++)
            //cartimages.add(ci.get(i).getCartImage());
        goodsservice.updateGoods(bId,bPhone,bName,bAddres,ci);
        return "redirect:/deleteCart1";
    }

    @RequestMapping("/selectgoods")
    public String selectgoods( Model model){

        int a=1;
        List<GoodsInfo> gi=goodsservice.selectGoods(a);
        model.addAttribute("gi",gi);
        return "success";
    }

    @RequestMapping("/selectsortgoods")
    public String selectsortgoods(String goodsSort,Model model){
        List<GoodsInfo> gi=goodsservice.selectsortGoods(goodsSort);
        model.addAttribute("gi",gi);
        return  "sort";
    }

    @RequestMapping("/selectuidgoods")
    public String selectuidgoods(Model model,HttpServletRequest request){
        HttpSession session=request.getSession();
        Object obj=session.getAttribute("key");
        String uId=obj.toString();
        List<GoodsInfo> gi=goodsservice.selectuidGoods(uId);
        model.addAttribute("gi",gi);
        return "userGoods";
    }
    @RequestMapping("/userSell")
    public String selectsellGoods(Model model,HttpServletRequest request){
        HttpSession session=request.getSession();
        Object obj=session.getAttribute("key");
        String uId=obj.toString();
        List<GoodsInfo> gi=goodsservice.selectuidGoods(uId);
        model.addAttribute("gi",gi);
        return "userSell";
    }

    @RequestMapping("/userBuy")
    public String selectsbuyGoods(Model model,HttpServletRequest request){
        HttpSession session=request.getSession();
        Object obj=session.getAttribute("key");
        String bId=obj.toString();
        List<GoodsInfo> gi=goodsservice.selectbuyGoods(bId);
        model.addAttribute("gi",gi);
        return "userBuy";
    }

    @RequestMapping("/selectidgoods")
    public String selectidgoods(@RequestParam(value = "goodsId") String goodsId,Model model){
        System.out.println("HelloWorld");
        List<GoodsInfo> gi=goodsservice.selectidGoods(goodsId);
        //List<GoodsInfo> gi=goodsservice.selectidGoods(goodsId);
        //System.out.println(gi.get(0).getGoodsName());
        return "redirect:/insertCart?cartName="+gi.get(0).getGoodsName()+"&cartImage="+gi.get(0).getGoodsImage()+"&cartPrice="+gi.get(0).getGoodsPrice();
    }

    @RequestMapping("/deletegoods")
    public String deletegoods(String goodsId){
        int g=goodsservice.deleteGoods(goodsId);
        if (g>0)
            return "admin";
        else
            return "fail";
    }


    @RequestMapping("/insertgoods")
    public String insertgoods1(@RequestParam(value = "goodsImage") MultipartFile file,@RequestParam("goodsName")String goodsName,@RequestParam("goodsRemark")String goodsRemark,@RequestParam("goodsSort")String goodsSort,@RequestParam("goodsPrice")int goodsPrice,HttpServletRequest request){
        GoodsInfo gi=new GoodsInfo();
        try {
            String filePath = "F:\\goldfish\\src\\main\\resources\\static\\image";
            String originalFilename = file.getOriginalFilename();
            String newFileName = UUID.randomUUID() + originalFilename;
            //封装上传文件位置的全路径
            File targetFile = new File(filePath, newFileName);
            //把本地文件上传到封装上传文件位置的全路径
            file.transferTo(targetFile);

            gi.setGoodsImage("image/"+newFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }


        HttpSession session=request.getSession();
        Object obj=session.getAttribute("key");
        String uId=obj.toString();
        gi.setuId(uId);
        gi.setGoodsSort(goodsSort);
        gi.setGoodsName(goodsName);
        gi.setGoodsPrice(goodsPrice);
        gi.setGoodsRemark(goodsRemark);
        goodsservice.insertGoods(gi);
       return "fish";

    }

    @RequestMapping("/issuegoods")
    public String issuegoods(){
        return "issuegoods";
    }

}
