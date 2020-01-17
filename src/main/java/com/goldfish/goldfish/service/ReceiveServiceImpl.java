package com.goldfish.goldfish.service;

import com.goldfish.goldfish.dao.ReceiveDao;
import com.goldfish.goldfish.entity.ReceiveInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("receiveservice")
public class ReceiveServiceImpl {
    ReceiveDao receiveDao;
    public List<ReceiveInfo> selectReveive(){
        return receiveDao.selectReveive();
    }
    public int insertReceive(int receiveoId){
        return receiveDao.insertReceive(receiveoId);

    }
    public int insertReceive1(ReceiveInfo receiveInfo){
        return receiveDao.insertReceive1(receiveInfo);
    }
}
