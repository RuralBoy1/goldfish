package com.goldfish.goldfish.service;

import com.goldfish.goldfish.dao.SortDao;
import com.goldfish.goldfish.entity.SortInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sortservice")
public class SortServiceimpl implements SortService {
    @Autowired
    private SortDao sortdao;
    public List<SortInfo> selectSort(){
        return  sortdao.selectSort();
    }


    public int insertSort(String sortName){
        return sortdao.insertSort(sortName);
    }

    public int deleteSort(String sortName){
        return sortdao.deleteSort(sortName);
    }
}
