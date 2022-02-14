package com.xq.tmall.controller.fore;


import com.xq.tmall.service.IdeaService;
import com.xq.tmall.util.RespBean;
import com.xq.tmall.vo.IdeaVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Description:new idea
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/2/12 10:54
 **/
@Controller
@RequestMapping("/newIdea")
public class IdeaController {

    @Resource(name = "ideaService")
    private IdeaService ideaService;
    /**
     * 跳转到创意圈子页面
     * @return
     */
    @RequestMapping(value = "/ideaCircle", method = RequestMethod.GET)
    public String goToPage(HttpSession session, Map<String, Object> map) {
        return "fore/ideaCircle";
    }

    /**
     * 获取new idea模块所有信息
     * @return
     */
    @RequestMapping("/getIdea")
    public RespBean getNewIdea(){
        return ideaService.getNewIdea();
    }

    /**
     * 添加new idea
     * @param ideaVo
     * @param session
     * @return
     */
    @RequestMapping("/addIdea")
    public RespBean addIdea(IdeaVo ideaVo, HttpSession session){
        return ideaService.addIdea(ideaVo,session);
    }
}
