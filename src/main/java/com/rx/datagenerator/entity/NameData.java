package com.rx.datagenerator.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by r.x on 2018/2/14.
 */
public class NameData extends BaseDataCreator {

    private final String[] names = {"梦琪", "忆柳", "之桃", "慕青", "问兰", "尔岚", "元香",
            "初夏", "沛菡", "傲珊", "曼文", "乐菱", "痴珊", "恨玉", "惜文", "香寒", "新柔", "语蓉",
            "海安", "夜蓉", "涵柏", "水桃", "醉蓝", "春儿", "语琴", "从彤", "傲晴", "语兰", "又菱",
            "碧彤", "元霜", "怜梦", "紫寒", "妙彤", "曼易", "南莲", "紫翠", "雨寒", "易烟", "如萱",
            "若南", "寻真", "晓亦", "向珊", "慕灵", "以蕊", "寻雁", "映易", "雪柳", "孤岚", "笑霜",
            "海云", "凝天", "沛珊", "寒云", "冰旋", "宛儿", "绿真", "盼儿", "晓霜", "碧凡", "夏菡",
            "曼香", "若烟", "半梦", "雅绿", "冰蓝", "灵槐", "平安", "书翠", "翠风", "香巧", "代云",
            "梦曼", "幼翠", "友巧", "听寒", "梦柏", "醉易", "访旋", "亦玉", "凌萱", "访卉", "怀亦",
            "笑蓝", "春翠", "靖柏", "夜蕾", "冰夏", "梦松", "书雪", "乐枫", "念薇", "靖雁", "寻春",
            "恨山", "从寒", "忆香", "觅波", "静曼", "凡旋", "以亦", "念露", "芷蕾", "千兰", "新波",
            "代真", "新蕾", "雁玉", "冷卉", "紫山", "千琴", "恨天", "傲芙", "盼山", "怀蝶", "冰兰",
            "山柏", "翠萱", "乐丹", "翠柔", "谷山", "之瑶", "冰露", "尔珍", "谷雪", "乐萱", "涵菡",
            "海莲", "傲蕾", "青槐", "冬儿", "易梦", "惜雪", "宛海", "之柔", "夏青", "亦瑶", "妙菡",
            "春竹", "紫蓝", "晓巧", "幻柏", "访蕊", "南春", "芷蕊", "凡蕾", "凡柔", "安蕾", "天荷",
            "含玉", "书兰", "雅琴", "书瑶", "春雁", "从安", "夏槐", "念芹", "怀萍", "代曼", "幻珊",
            "谷丝", "秋翠", "白晴", "海露", "代荷", "含玉", "书蕾", "听白", "访琴", "灵雁", "秋春",
            "雪青", "乐瑶", "含烟", "涵双", "平蝶", "雅蕊", "傲之", "灵薇", "绿春", "含蕾", "从梦",
            "从蓉", "初丹。听兰", "听蓉", "语芙", "夏彤", "凌瑶", "忆翠", "幻灵", "怜菡", "紫南",
            "依珊", "妙竹", "访烟", "怜蕾", "映寒", "友绿", "冰萍", "惜霜", "凌香", "芷蕾", "雁卉",
            "迎梦", "元柏", "代萱", "紫真", "千青", "凌寒", "紫安", "寒安", "怀蕊", "秋荷", "涵雁",
            "以山", "凡梅", "盼曼", "翠彤", "谷冬", "新巧", "冷安", "千萍", "冰烟", "雅阳", "友绿",
            "南松", "诗云", "书芹", "曼荷", "笑珊", "寒珊", "谷南", "慕儿", "夏岚", "友儿", "小萱",
            "紫青", "妙菱", "冬寒", "曼柔", "语蝶", "青筠", "夜安", "觅海", "问安", "晓槐", "雅山",
            "访云", "翠容", "寒凡", "晓绿", "以菱", "冬云", "含玉", "访枫", "含卉", "夜白", "灵竹",
            "醉薇", "元珊", "幻波", "盼夏", "元瑶", "迎曼", "水云", "访琴", "谷波", "乐之", "笑白",
            "之山", "妙海", "紫霜", "平夏", "凌旋", "孤丝", "怜寒", "向萍", "凡松", "白薇", "梦菡",
            "飞绿", "如波", "又晴", "友易", "香菱", "冬亦", "问雁", "妙春", "海冬", "半安", "平春",
            "幼柏", "秋灵", "凝芙", "念烟", "白山", "从灵", "尔芙"};

    @Override
    public List<String> loadData(Integer limit) {
        List<String> datas = new ArrayList<>(limit);
        int count = 0;
        while (count < limit) {
            datas.add(names[count % names.length]);
            count++;
        }
        return datas;
    }
}
