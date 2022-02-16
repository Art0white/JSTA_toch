package com.xq.tmall.dao;

import com.xq.tmall.entity.AfterSale;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:售后
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/2/14 12:37
 **/
@Repository
public interface AfterSaleMapper {

    /**
     * 插入售后表
     * @param afterSale
     * @return
     */
    public int insertAfterSale(@Param("afterSale") AfterSale afterSale);

    /**
     * 根据userId获取此用户的所有信息
     * @param userId
     * @return
     */
    public List<AfterSale> getAfterSale(@Param("userId") Integer userId);
}
