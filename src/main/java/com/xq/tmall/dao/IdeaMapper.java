package com.xq.tmall.dao;

import com.xq.tmall.entity.Idea;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:new idea
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/2/12 11:03
 **/
@Repository
public interface IdeaMapper {

    /**
     * 获取创意(idea)的所有内容
     * @return
     */
    public List<Idea> getNewIdea();

    /**
     * 插入idea
     * @param idea
     * @return
     */
    public int insertIdea(@Param("idea") Idea idea);
}
