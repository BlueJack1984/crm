package com.example.core.io.output;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @param <T>
 */
@Data
@Slf4j
@NoArgsConstructor
public class OutputResult<T> {
    /**
     *
     */
    private Integer code = 200;
    /**
     *
     */
    private String message = "SUCCESS";
    /**
     *
     */
    private T data;

    /**
     * 无参数构造器
     * 没有数据，成功状态,没有返回数据
     */
//    public OutputResult() {
//
//    }
    /**
     * 有参数构造器，失败情况
     */
    public OutputResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    /**
     * 有参数构造器
     * 成功状态,有返回数据
     */
    public OutputResult(T data) {
        this.data = data;
    }
}
