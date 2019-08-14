package com.example.bean.base;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体
 * @author shusheng
 * @date 2019-08-15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BasicEntity implements Serializable {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 数据状态值
     */
    private Integer status;
    /**
     * 数据创建时间
     */
    private Date createTime;
    /**
     * 数据更新时间
     */
    private Date updateTime;
}
