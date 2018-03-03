package com.rx.datagenerator.service;

import com.rx.datagenerator.entity.RowData;
import com.rx.datagenerator.util.FileUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by r.x on 2018/2/14.
 */
@Service
public class CustomService {

    public void create(RowData rowData) {
        List<List<String>> content = new ArrayList<>();
        rowData.getDatas().forEach(row -> content.add(row.loadData(rowData.getLimit())));
        final String path = "E:\\data\\time.txt";
        FileUtil.txt(content, path, rowData.getConnector());
    }
}
