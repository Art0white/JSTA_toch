package com.xq.tmall.service;

import com.xq.tmall.util.RespBean;
import com.xq.tmall.vo.IdeaVo;

import javax.servlet.http.HttpSession;

/**
 * @Description:new idea
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/2/12 11:00
 **/
public interface IdeaService {

    /**
     * 获取new idea模块所有信息
     * @return
     */
    public RespBean getNewIdea();

    /**
     * 添加new idea
     * @param ideaVo
     * @param session
     * @return
     */
    public RespBean addIdea(IdeaVo ideaVo, HttpSession session);
}
