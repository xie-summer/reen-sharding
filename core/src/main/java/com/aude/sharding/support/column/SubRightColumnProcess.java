package com.aude.sharding.support.column;

import com.aude.sharding.router.ColumnProcess;

/**
 * Created by sidawei on 16/3/20.
 *
 * 截取值的后几位
 */
public class SubRightColumnProcess implements ColumnProcess {

    private int length;

    @Override
    public Object apply(Object columnValue) {
        String s = String.valueOf(columnValue);
        if(s.length() > length){
            s = s.substring(s.length() - length);
        }
        return s;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("[SubRight:%s]", length);
    }
}
