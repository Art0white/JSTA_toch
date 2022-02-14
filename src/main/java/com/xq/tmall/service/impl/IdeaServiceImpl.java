package com.xq.tmall.service.impl;

import com.xq.tmall.dao.CategoryMapper;
import com.xq.tmall.dao.IdeaMapper;
import com.xq.tmall.dao.UserMapper;
import com.xq.tmall.entity.Idea;
import com.xq.tmall.entity.User;
import com.xq.tmall.service.IdeaService;
import com.xq.tmall.util.QiniuUtil;
import com.xq.tmall.util.RespBean;
import com.xq.tmall.util.RespBeanEnum;
import com.xq.tmall.util.UUIDUtil;
import com.xq.tmall.vo.IdeaVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @Description:new idea
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/2/12 11:01
 **/
@Service("ideaService")
public class IdeaServiceImpl implements IdeaService {

    private IdeaMapper ideaMapper;
    private UserMapper userMapper;

    @Resource(name = "ideaMapper")
    public void IdeaMapper(IdeaMapper ideaMapper) {
        this.ideaMapper = ideaMapper;
    }
    @Resource(name = "userMapper")
    public void UserMapper(UserMapper userMapper) {this.userMapper = userMapper; }

    /**
     * 获取new idea模块所有信息
     * @return
     */
    @Override
    public RespBean getNewIdea() {
        List<Idea> newIdea = ideaMapper.getNewIdea();
        return RespBean.success(newIdea);
    }

    /**
     * 添加new idea
     * @param ideaVo
     * @param session
     * @return
     */
    @Override
    public RespBean addIdea(IdeaVo ideaVo, HttpSession session) {
        //根据session获取userId
        Integer userId=(Integer)session.getAttribute("userId");
        //根据userId获取user对象
        User user = userMapper.selectOne(userId);
        //将idea存入数据库
        //将图片存入七牛云
        MultipartFile ideaPicture = ideaVo.getIdeaPicture();
        //上传到七牛云的图片url
        String Url;
        if(ideaPicture.isEmpty()){
            return RespBean.error(RespBeanEnum.EMPTY_FILE);
        }
        try {
            byte[] pictureBytes = ideaPicture.getBytes();
            //随机生成UUID作为图片名称
            String imgName = UUIDUtil.getUUID();
            QiniuUtil qiniuUtil = new QiniuUtil();
            try {
                //以base64方式上传到七牛云
                Url = qiniuUtil.put64image(pictureBytes, imgName);
            } catch (Exception e) {
                e.printStackTrace();
                return RespBean.error(RespBeanEnum.ERROR_FILE);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return RespBean.error(RespBeanEnum.ERROR_FILE);
        }
        //将idea中的其他信息传到数据库中
        //获取userId
        Idea idea=new Idea(ideaVo.getIdeaId(),userId,ideaVo.getIdeaTitle(),ideaVo.getIdeaContent(),Url,ideaVo.getIdeaTelphone(),ideaVo.getIdeaMail());
        ideaMapper.insertIdea(idea);
        return RespBean.success();
    }
}
