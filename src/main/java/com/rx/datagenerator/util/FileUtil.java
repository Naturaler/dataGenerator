package com.rx.datagenerator.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by r.x on 2018/2/12.
 */
public class FileUtil {

    public static void txt(List<List<String>> content, final String path, final String connector) {
        File file = new File(path);
        try {
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file));
            StringBuilder sb = new StringBuilder();
            Map<Integer, List<String>> contentMap = new HashMap<>(content.size());
            for (int i = 0; i < content.size(); i++) {
                contentMap.put(i, content.get(i));
            }
            final List<String> template = contentMap.get(0);
            for (int columnIndex = 0; columnIndex < template.size(); columnIndex++) {
                for (int listIndex = 0; listIndex < content.size(); listIndex++) {
                    sb.append(contentMap.get(listIndex).get(columnIndex))
                            .append(listIndex != content.size() - 1 ? connector : "");
                }
                sb.append("\r\n");
            }
            outputStream.write(sb.toString().getBytes());
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void excel() {

    }
}
