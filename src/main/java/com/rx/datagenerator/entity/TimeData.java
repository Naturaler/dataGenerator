package com.rx.datagenerator.entity;

import com.rx.datagenerator.Exception.TypeMissMatchException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by r.x on 2018/2/12.
 * 每个时间的内容
 */
public class TimeData extends BaseDataCreator {
    private final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private final Unit DEFAULT_UNIT = Unit.DAY;
    private final Date DEFAULT_MIN = new Date();

    private Unit unit;
    private String format;
    private Date min;
    private Date max;
    private Integer step;

    public TimeData(String format, Date min, Date max, Integer step, Unit unit) {
        this.format = format;
        this.min = min;
        this.max = max;
        this.step = step;
        this.unit = unit;
    }

    public TimeData() {
    }

    @Override
    public List<String> loadData(Integer limit) {
        if (format == null) {
            format = DEFAULT_FORMAT;
        }
        // 默认最小值为当前时间
        if (min == null) {
            min = DEFAULT_MIN;
        }
        // 默认最小值的100天后
        if (max == null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(min);
            calendar.add(Calendar.DAY_OF_YEAR, 100);
            max = calendar.getTime();
        }
        if (unit == null) {
            unit = DEFAULT_UNIT;
        }
        final SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        List<String> timeDatas = new ArrayList<>(limit);
        Calendar index = Calendar.getInstance();
        index.setTime(min);
        for (int i = 0; i < limit; i++) {
            if (index.getTimeInMillis() <= max.getTime()) {
                timeDatas.add(dateFormat.format(index.getTime()));
                index.add(unit.unit, step);
                continue;
            }
            index.setTime(min);
            i -= 1;
        }
        /*
        数据数量限制
        数据大小限制
         */
        return timeDatas;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Date getMin() {
        return min;
    }

    public void setMin(Date min) {
        this.min = min;
    }

    public Date getMax() {
        return max;
    }

    public void setMax(Date max) {
        this.max = max;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "TimeData{" +
                "format='" + format + '\'' +
                ", min=" + min +
                ", max=" + max +
                ", step=" + step +
                ", unit=" + unit +
                '}';
    }

    public enum Unit {
        YEAR(Calendar.YEAR), MONTH(Calendar.MONTH), DAY(Calendar.DAY_OF_YEAR),
        HOUR(Calendar.HOUR_OF_DAY), MINUTE(Calendar.MINUTE), SECOND(Calendar.SECOND);
        private Integer unit;

        public Long getTime() {
            switch (unit) {
                case Calendar.YEAR:
                    return (365 * 24 * 60 * 60 * 1000L);
                case Calendar.MONTH:
                    return (30 * 24 * 60 * 60 * 1000L);
                case Calendar.DAY_OF_YEAR:
                    return (24 * 60 * 60 * 1000L);
                case Calendar.HOUR_OF_DAY:
                    return (60 * 60 * 1000L);
                case Calendar.MINUTE:
                    return (60 * 1000L);
                case Calendar.SECOND:
                    return 1000L;
                default:
                    throw new TypeMissMatchException();
            }
        }

        @Override
        public String toString() {
            return "Unit{" +
                    "unit=" + unit +
                    '}';
        }

        public Integer getUnit() {
            return unit;
        }

        public void setUnit(Integer unit) {
            this.unit = unit;
        }

        Unit(Integer unit) {
            this.unit = unit;
        }
    }
}
