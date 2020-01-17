package com.goldfish.goldfish.dao;

import com.goldfish.goldfish.entity.ReceiveInfo;
import java.util.*;

public interface ReceiveDao {
    public List<ReceiveInfo> selectReveive();
    public int insertReceive(int receiveoId);
    public int insertReceive1(ReceiveInfo receiveInfo);
}
