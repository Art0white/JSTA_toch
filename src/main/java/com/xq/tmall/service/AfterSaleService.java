package com.xq.tmall.service;

import com.xq.tmall.util.RespBean;
import com.xq.tmall.vo.AfterSaleVo;

import javax.servlet.http.HttpSession;

/**
 * @Description:售后服务
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/2/14 9:28
 **/
public interface AfterSaleService {

    /**
     * 用户提交售后服务信息
     * @param afterSaleVo
     * @param session
     * @return
     */
    public RespBean submit(AfterSaleVo afterSaleVo, HttpSession session);

    /**
     * 获取此用户的所有售后信息
     * @param session
     * @return
     */
    public RespBean getAfterSale(HttpSession session);
}
