package com.rx.datagenerator.entity;

import java.util.List;

/**
 * Created by r.x on 2018/2/12.
 * 每一行的内容
 */
public class RowData {
    private List<BaseDataCreator> datas;
    private String connector;
    private Integer limit;
    private FileType fileType;

    public List<BaseDataCreator> getDatas() {
        return datas;
    }

    public void setDatas(List<BaseDataCreator> datas) {
        this.datas = datas;
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return "RowData{" +
                "datas=" + datas +
                ", connector='" + connector + '\'' +
                ", limit=" + limit +
                ", fileType=" + fileType +
                '}';
    }

    public enum FileType {
        TXT, EXCEL;
    }
}
