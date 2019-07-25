package com.example.core.dao;

import com.example.core.entity.CountryLanguage;

public interface CountryLanguageMapper {
    int insert(CountryLanguage record);

    int insertSelective(CountryLanguage record);
}