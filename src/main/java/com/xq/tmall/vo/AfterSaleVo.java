package com.xq.tmall.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description:售后服务
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/2/14 9:26
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AfterSaleVo {

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
     * 售后服务照片文件
     */
    private MultipartFile afterSalePicture;
}
