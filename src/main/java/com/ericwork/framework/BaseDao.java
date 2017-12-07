package com.ericwork.framework;

public interface BaseDao<T> {

    abstract T selectObject(long id);

    abstract T selectAnyObject(long id);

    abstract void insertObject(T objc);

    abstract void updateObject(T objc);


}
