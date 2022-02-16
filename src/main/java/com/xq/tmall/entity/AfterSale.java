package com.xq.tmall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Description:售后服务表
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/2/14 9:20
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AfterSale {

    /**
     * 售后服务表id
     */
    private Integer afterSaleId;

    /**
     * 售后服务单号
     */
    private String afterSaleNumber;

    /**
     * 售后服务用户Id
     */
    private Integer afterSaleUserId;

    /**
     * 售后服务描述
     */
    private String afterSaleState;

    /**
     * 售后服务照片，存的是路径
     */
    private String afterSalePicture;

    /**
     * 售后提交时间
     */
    private Date afterSaleCreateDate;
}
