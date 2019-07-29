package com.example.core.dao;

import com.example.bean.entity.CountryLanguage;

public interface CountryLanguageMapper {
    int insert(CountryLanguage record);

    int insertSelective(CountryLanguage record);
}