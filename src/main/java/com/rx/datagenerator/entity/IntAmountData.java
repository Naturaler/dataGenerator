package com.rx.datagenerator.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by r.x on 2018/2/14.
 */
public class IntAmountData extends BaseDataCreator {
    private final Integer DEFAULT_MIN = 0;
    private final Integer DEFAULT_MAX = 100;
    private final Integer DEFAULT_STEP = 1;

    private Integer min;
    private Integer max;
    private Integer step;

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
        int index = min;
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

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    @Override
    public String toString() {
        return "IntAmountData{" +
                "DEFAULT_MIN=" + DEFAULT_MIN +
                ", DEFAULT_MAX=" + DEFAULT_MAX +
                ", DEFAULT_STEP=" + DEFAULT_STEP +
                ", min=" + min +
                ", max=" + max +
                ", step=" + step +
                '}';
    }
}
