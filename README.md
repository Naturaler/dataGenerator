# dataGenerator 数据生成器
该项目的目的在于快速生成测试数据，数据类型包括时间、数值、人名等
用户可指定数据类型、数量、不同类型间的连接符等内容
数据类型详情：
- 时间：可指定时间格式、最大最小值、时间间隔和间隔单位
  - 时间格式选项：默认 yyyy-MM-dd HH:mm:ss
    - y：年
    - M：月
    - d：日
    - H：时
    - m：分
    - s：秒
  - 最小值：默认当天
  - 最大值：当天的100天后
  - 时间间隔单位包括：年、月、天、时、分、秒等，默认天
- 整型数值：可指定最大最小值、数值间隔
  - 最小值：默认0
  - 最大值：默认100
  - 间隔：默认1
- 浮点型数值：可指定最大最小值、数值间隔
  - 最小值：默认0D
  - 最大值：默认100D
  - 间隔：默认1D
- 人名：有内置的人名数组，无其他特殊变量