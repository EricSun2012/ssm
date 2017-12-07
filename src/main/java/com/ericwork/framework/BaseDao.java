package com.ericwork.framework;

import java.util.List;

/**
 * 通用泛型DAO基类
 *
 * @param <T>
 * @author g
 */
public interface BaseDao<T> {
    /**
     * 对对象进行持久化操作，如果成功则返回持久化后的ID
     * 失败则返回null
     *
     * @param obj
     * @return
     */
    void saveObject(T obj);


    /**
     * @param id
     * @return 找到返回，否则返回空
     */
    T selectObject(long id);

    /**
     * 删除指定id的持久化对象
     *
     * @param id
     */
    void deleteObject(T obj);

    /**
     * 修改指定的持久化对象
     *
     * @param id
     * @param obj
     */
    void updateObject(T obj);

    /**
     * 返回所有持久化对象
     *
     * @return
     */
    List<T> selectAllObject();

    /**
     * 传入页码对象，进行分页查询
     *
     * @param
     * @return
     */
    List<T> selectManyObjects();

    List<T> selectAnyObjects();
}
