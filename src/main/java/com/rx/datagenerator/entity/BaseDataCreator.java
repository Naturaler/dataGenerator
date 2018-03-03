package com.rx.datagenerator.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

/**
 * Created by r.x on 2018/2/12.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(
        {
            @JsonSubTypes.Type(value = com.rx.datagenerator.entity.TimeData.class, name = "time"),
            @JsonSubTypes.Type(value = com.rx.datagenerator.entity.NameData.class, name = "name"),
            @JsonSubTypes.Type(value = com.rx.datagenerator.entity.RegionalData.class, name = "regional"),
            @JsonSubTypes.Type(value = com.rx.datagenerator.entity.IntAmountData.class, name = "int"),
            @JsonSubTypes.Type(value = com.rx.datagenerator.entity.DoubleAmountData.class, name = "double")
        }
)
public abstract class BaseDataCreator {
    private String type;

    public abstract List<String> loadData(Integer limit);
}
