package com.xq.tmall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * @Description:new idea
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/2/12 11:03
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Idea {

    /**
     * 创意id
     */
    private Integer ideaId;

    /**
     * 创意对应的用户id
     */
    private Integer userId;

    /**
     * 创意的标题
     */
    private String ideaTitle;

    /**
     * 创意的主题内容
     */
    private String ideaContent;

    /**
     * 创意中的图片路径
     */
    private String ideaPictureSrc;

    /**
     * 创意联系方式：手机号
     */
    private String ideaTelphone;

    /**
     * 创意联系方式：邮箱
     */
    private String ideaMail;

    /**
     * 发布日期
     */
    private Date createDate;

    public Idea(Integer userId, String ideaTitle, String ideaContent, String ideaPictureSrc, String ideaTelphone, String ideaMail, Date createDate) {
        this.userId = userId;
        this.ideaTitle = ideaTitle;
        this.ideaContent = ideaContent;
        this.ideaPictureSrc = ideaPictureSrc;
        this.ideaTelphone = ideaTelphone;
        this.ideaMail = ideaMail;
        this.createDate = createDate;
    }
}
