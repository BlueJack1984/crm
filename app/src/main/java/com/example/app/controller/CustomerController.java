package com.example.app.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

public class CustomerController {

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @ApiOperation(value = "获取用户", notes = "获取用户", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户ID", required = true),
            @ApiImplicitParam(name = "userCode", value = "用户Code")
    })
    public void get() {

    }
}
