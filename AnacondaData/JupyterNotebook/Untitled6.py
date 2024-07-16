#!/usr/bin/env python
# coding: utf-8

# In[47]:


from pyecharts.charts import Bar, Timeline
from pyecharts import options as opts
from pyecharts.commons.utils import JsCode
import pandas as pd
import numpy as np


# In[50]:


df = pd.read_csv('F:\\python\\5月21日\\2024世界GDP数据分析.csv',
 encoding='gbk',index_col=0)
df.tail()


# In[33]:


#为了后面循环构造数据方便，需要重构成以下数据集
df_new= pd.DataFrame(
 index=df.columns,
 columns=df.index,
 data = df.values.T)
df_new


# In[34]:


#构造一个升序的数据集
df_2023 =pd.DataFrame(df_new[2023].sort_values())
df_2023


# In[35]:


# 构造2023条形图的xy轴，x轴为国家分类，y轴为GDP数据
x_2023_data = df_2023.index.to_list()
y_2023_data =df_2023[2023].to_list()
y_2023_data
x_2023_data


# In[36]:


# 绘制图形
bar_2023new = (
 Bar()
 .add_xaxis(x_2023_data)
 .add_yaxis(series_name="",y_axis=y_2023_data)
 .reversal_axis()
 .set_global_opts(title_opts=opts.TitleOpts("2023年世界经济排名"))
)


# In[37]:


bar_2023new.render('2023年世界轮播图.html')


# In[38]:


tl = Timeline(init_opts=opts.InitOpts(width='1400px', height='800px'))


# In[48]:


# 遍历年份数据
for i in range(1960, 2024):
    # 构造1年的数据
    df_year = pd.DataFrame(df_new[i].sort_values())
    x_year_data = df_year.index.to_list()
    y_year_data = df_year[i].to_list()

    # 创建Bar对象
    bar_year = (
        Bar()
        .add_xaxis(x_year_data)
        .add_yaxis(
            series_name="",
            y_axis=y_year_data,
            itemstyle_opts=opts.ItemStyleOpts(color=JsCode("""
                function (params) {
                    var colorList = ['#c23531', '#314656', '#dd8668', '#91c7ae', '#6e7074', '#61a0a8', '#efa18d', '#787464', '#cc7e63', '#724e58'];
                    return colorList[params.dataIndex % colorList.length];
                }
            """))  # 使用JsCode定义颜色函数
        )
        .reversal_axis()  # 反转坐标轴
        .set_global_opts(title_opts=opts.TitleOpts("{}年世界经济排名".format(i)))
    )

    tl.add(bar_year, "{}年".format(i))  # 将Bar对象添加到Timeline
    tl.add_schema(play_interval=300, is_auto_play=False)  # 添加播放控制选项


# In[49]:


tl.render('1960-2023年世界GDP动态排名.html')


# In[ ]:




