package com.rx.datagenerator.web;

import com.rx.datagenerator.entity.RowData;
import com.rx.datagenerator.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by r.x on 2018/2/12.
 */
@RestController
@RequestMapping("/custom")
public class CustomController {
    @Autowired
    private CustomService service;

    @GetMapping("/test")
    public String test() {
        return "hello world!";
    }

    @PostMapping("/create")
    public String create(@RequestBody RowData rowData) {
        service.create(rowData);
        return "file create successful !";
    }

    @GetMapping("/sql")
    public String sql() {
        return "sql";
    }
}

