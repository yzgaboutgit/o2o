package com.imooc.service.impl;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.imooc.entity.Area;
import com.imooc.mapper.AreaDao;
import com.imooc.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author yzg
 * @date 2018/11/14 - 8:59
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList() throws JsonParseException, JsonMappingException, IOException {
        return areaDao.queryArea();
    }
}
