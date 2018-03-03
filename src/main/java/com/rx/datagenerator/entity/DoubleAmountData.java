package com.rx.datagenerator.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by r.x on 2018/2/16.
 */
public class DoubleAmountData extends com.rx.datagenerator.entity.BaseDataCreator {
    private final Double DEFAULT_MIN = 0D;
    private final Double DEFAULT_MAX = 100D;
    private final Double DEFAULT_STEP = 1D;

    private Double min;
    private Double max;
    private Double step;

    @Override
    public List<String> loadData(Integer limit) {
        if (min == null) {
            min = DEFAULT_MIN;
        }
        if (max == null) {
            max = DEFAULT_MAX;
        }
        if (step == null) {
            step = DEFAULT_STEP;
        }
        double index = min;
        List<String> intDatas = new ArrayList<>(limit);
        for (int i = 0; i < limit; i++) {
            if (index <= max) {
                intDatas.add(index + "");
                index += step;
                continue;
            }
            index = min;
            i -= 1;
        }
        return intDatas;
    }
}
