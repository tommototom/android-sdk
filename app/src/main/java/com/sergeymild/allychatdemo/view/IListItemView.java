package com.sergeymild.allychatdemo.view;

/**
 * Created by Alexander Ezhkov on 04.09.15.
 */
public interface IListItemView<T> {
    void populate(T entity);
}
