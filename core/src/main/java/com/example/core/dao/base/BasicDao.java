package com.example.core.dao.base;


import java.util.List;
import java.util.Set;

/**
 *
 * @param <K>
 * @param <V>
 */
public interface BasicDao<K, V> {

    /**
     *
     */
    V selectById(K id);
    /**
     *
     */
    List<V> selectByIds(Set<K> ids);
    /**
     *
     */
    void insert(V entity);
    /**
     *
     */
    void update(V entity);
    /**
     *
     */
    void deleteById(K id);

}
