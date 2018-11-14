package com.imooc.mapper;

import com.imooc.entity.Area;

import java.util.List;

/**
 * @author yzg
 * @date 2018/11/12 - 10:08
 */
public interface AreaDao {
    /**
     * 列出区域列表
     * @return
     */
    List<Area> queryArea();
}
