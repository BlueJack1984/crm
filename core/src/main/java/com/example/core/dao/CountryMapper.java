package com.example.core.dao;

import com.example.bean.entity.Country;

public interface CountryMapper {
    int insert(Country record);

    int insertSelective(Country record);
}