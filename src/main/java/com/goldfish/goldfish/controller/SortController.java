package com.goldfish.goldfish.controller;

import com.goldfish.goldfish.entity.SortInfo;
import com.goldfish.goldfish.service.SortService;
import com.goldfish.goldfish.service.SortServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SortController {
    @Autowired
    private SortService sortservice;

    @RequestMapping("/selectsort1")
    public String selectsort1(Model model){
        List<SortInfo> si=sortservice.selectSort();
        model.addAttribute("si",si);
        return "issuegoods";
    }

    @RequestMapping("/selectsort")
    public String selectsort(Model model){
        List<SortInfo> si=sortservice.selectSort();
        model.addAttribute("si",si);
        return "fish";
    }

    @RequestMapping("/deletesort")
    public void deletesort(SortInfo si){
        sortservice.deleteSort(si.getSortName());
    }

    @RequestMapping("/insertsort")
    public String insertsort(SortInfo si){
        sortservice.insertSort(si.getSortName());
        return "redirect:/selectsort";
    }

}
