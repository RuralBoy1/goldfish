package com.goldfish.goldfish.dao;
import org.apache.ibatis.annotations.Param;
import com.goldfish.goldfish.entity.SortInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SortDao {
    public List<SortInfo> selectSort();
    public int insertSort(String sortName);
    public int deleteSort(String sortName);
}
