package com.xq.tmall.controller.fore;

import com.xq.tmall.service.AfterSaleService;
import com.xq.tmall.util.RespBean;
import com.xq.tmall.vo.AfterSaleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Description:售后服务
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/2/14 9:25
 **/
@Controller
@RequestMapping("/afterSale")
public class AfterSaleController {

    @Autowired
    private AfterSaleService afterSaleService;

    /**
     * 用户提交售后服务信息
     * @param afterSaleVo
     * @param session
     * @return
     */
    @RequestMapping("/submit")
    public RespBean submit(AfterSaleVo afterSaleVo, HttpSession session){
        return afterSaleService.submit(afterSaleVo,session);
    }
}
