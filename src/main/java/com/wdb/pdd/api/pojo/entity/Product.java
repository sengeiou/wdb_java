package com.wdb.pdd.api.pojo.entity;


import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("wdb_sys_product")
public class Product   {

    @TableId(type = IdType.INPUT)
    private int id;
    private String name;
    private String price;
    private String oldPrice;
    private String sold;
    private String image;
    private String otherDetailInfo;
    private String sort;
    private String addTime;


}
