package com.example.core.dao;

import com.example.core.entity.City;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CityMapper {
    int insert(City record);

    int insertSelective(City record);
}