package com.xq.tmall.service.impl;

import com.xq.tmall.dao.AfterSaleMapper;
import com.xq.tmall.entity.AfterSale;
import com.xq.tmall.service.AfterSaleService;
import com.xq.tmall.service.UserService;
import com.xq.tmall.util.QiniuService;
import com.xq.tmall.util.RespBean;
import com.xq.tmall.util.RespBeanEnum;
import com.xq.tmall.util.UUIDUtil;
import com.xq.tmall.vo.AfterSaleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @Description:售后服务
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/2/14 9:29
 **/
@Service
public class AfterSaleServiceImpl implements AfterSaleService {

    @Autowired
    private AfterSaleMapper afterSaleMapper;
    @Autowired
    private UserService userService;

    /**
     * 用户提交售后服务信息
     * @param afterSaleVo
     * @param session
     * @return
     */
    @Override
    public RespBean submit(AfterSaleVo afterSaleVo, HttpSession session) {
        //获取用户id
        Integer userId= (Integer)session.getAttribute("userId");
        //获取随机生成的UUID作为售后单号
        String afterSaleNumber = UUIDUtil.getUUID();
        //将售后图片上传到七牛云
        MultipartFile afterSalePicture = afterSaleVo.getAfterSalePicture();
        if(afterSalePicture.isEmpty()){
            return RespBean.error(RespBeanEnum.EMPTY_FILE);
        }
        //上传图片的url
        String url = null;
        try {
            url=QiniuService.saveImage(afterSalePicture);
        } catch (IOException e) {
            e.printStackTrace();
        }
        AfterSale afterSale=new AfterSale(afterSaleVo.getAfterSaleId(),afterSaleNumber,userId,afterSaleVo.getAfterSaleState(),url,new Date());
        afterSaleMapper.insertAfterSale(afterSale);
        System.out.println(">>>>>>>>"+RespBean.success().getCode());
        return RespBean.success();
    }

    /**
     * 获取此用户的所有售后信息
     * @param session
     * @return
     */
    @Override
    public RespBean getAfterSale(HttpSession session) {
        //使用ThreadLocal获取当前用户
        //User user = UserContext.getUser();
        Integer userId=((Integer) session.getAttribute("userId"));
        //根据userId获取售后信息
        List<AfterSale> afterSaleList = afterSaleMapper.getAfterSale(userId);
        return RespBean.success(afterSaleList);
    }
}
