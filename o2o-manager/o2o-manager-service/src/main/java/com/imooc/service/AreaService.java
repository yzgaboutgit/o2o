package com.imooc.service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.imooc.entity.Area;

import java.io.IOException;
import java.util.List;

/**
 * @author yzg
 * @date 2018/11/14 - 8:57
 */
public interface AreaService {
    /**
     *
     * @return
     * 查询所有地区
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws IOException
     */
    List<Area> getAreaList() throws JsonParseException, JsonMappingException,
            IOException;

}
