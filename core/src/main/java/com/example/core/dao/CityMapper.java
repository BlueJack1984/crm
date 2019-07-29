package com.example.core.dao;

import com.example.bean.entity.City;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper {
    int insert(City record);

    int insertSelective(City record);
}