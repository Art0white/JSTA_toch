package com.xq.tmall.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description:idea
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/2/12 12:21
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdeaVo {

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
     * 创意中的图片文件
     */
    private MultipartFile ideaPicture;

    /**
     * 创意联系方式：手机号
     */
    private String ideaTelphone;

    /**
     * 创意联系方式：邮箱
     */
    private String ideaMail;
}
