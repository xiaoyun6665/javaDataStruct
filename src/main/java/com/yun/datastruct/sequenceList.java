package com.yun.datastruct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 线性表
 * @since 2022-07-10
 */
public class sequenceList<T> {
    private ArrayList<T> listArray;

    private int size = 0;

    public sequenceList() {
        listArray = new ArrayList<>();
    }

    /**
     * 在index位置前插入值
     * @param index 元素下标（0~size-1）
     * @param value 值
     * @return 是否插入成功
     */
    public boolean add(int index, T value){
        if(index > size || index < 0 || value == null){
            System.out.println("值不合法");
            return false;
        }
        if((index == 0 && size == 0) || index == size){
            listArray.add(value);
            size = listArray.size();
            return true;
        } else {
            listArray.add(index,value);
            return true;
        }
    }

    public T remove(int index){
        if(index < 0 || index >= size){
            return null;
        }
        return listArray.get(index);
    }

    @Override
    public String toString() {
        return "sequenceList{" +
                "listArray=" + listArray +
                ", size=" + size +
                '}';
    }
}
