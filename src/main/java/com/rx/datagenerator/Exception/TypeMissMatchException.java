package com.rx.datagenerator.Exception;

/**
 * Created by r.x on 2018/2/12.
 */
public class TypeMissMatchException extends BaseException {
    public TypeMissMatchException() {
        super("未找到合适的匹配类型！");
    }
}
