package com.goldfish.goldfish.service;

import com.goldfish.goldfish.entity.SortInfo;

import java.util.List;

public interface SortService {
    public List<SortInfo> selectSort();
    public int insertSort(String sortName);
    public int deleteSort(String sortName);
}
