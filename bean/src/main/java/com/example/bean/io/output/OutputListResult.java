package com.example.bean.io.output;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Data
@Slf4j
public class OutputListResult<T> extends OutputResult<List<T>> {

    private Integer total;

    //public


}
