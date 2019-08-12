package com.example.core.io.output;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 *
 * @param <T>
 */
@Data
@Slf4j
public class OutputListResult<T> extends OutputResult<List<T>> {

    private Long total;

    /**
     * 对于List型数据集合
     * @param data
     */
    public OutputListResult(List<T> data) {
        super(data);
        this.total = (long) data.size();
    }

    /**
     * 返回逻辑分页结果
     */
    public OutputListResult(Page<T> data){
        super(data.getRecords());
        this.total = data.getTotal();
    }
    /**
     * 返回物理分页结果
     * 例如采用PageHelper插件实现分页
     */
    public OutputListResult(PageInfo<T> data) {
        super(data.getList());
        this.total = data.getTotal();
    }
}
