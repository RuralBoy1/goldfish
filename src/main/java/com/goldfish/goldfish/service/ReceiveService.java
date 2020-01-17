package com.goldfish.goldfish.service;

import com.goldfish.goldfish.entity.ReceiveInfo;

import java.util.List;

public interface ReceiveService {
    public List<ReceiveInfo> selectReveive();
    public int insertReceive(int receiveoId);
    public int insertReceive1(ReceiveInfo receiveInfo);
}
