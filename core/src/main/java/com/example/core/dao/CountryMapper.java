package com.example.core.dao;

import com.example.core.entity.Country;

public interface CountryMapper {
    int insert(Country record);

    int insertSelective(Country record);
}