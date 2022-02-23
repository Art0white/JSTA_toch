package com.xq.tmall.controller.fore;


import com.xq.tmall.entity.User;
import com.xq.tmall.service.IdeaService;
import com.xq.tmall.service.UserService;
import com.xq.tmall.util.RespBean;
import com.xq.tmall.vo.IdeaVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
    @Resource(name = "userService")
    private UserService userService;
    /**
     * 跳转到创意圈子页面
     * @return
     */
    @RequestMapping(value = "/ideaCircle", method = RequestMethod.GET)
    public ModelAndView goToPage(HttpSession session, Map<String, Object> map) {
        Object userId = session.getAttribute("userId");
        if (userId != null) {
            User user = userService.get(Integer.parseInt(userId.toString()));
            map.put("user", user);
        }

        ModelAndView modelAndView =new ModelAndView("fore/ideaCircle");
        ideaService.getNewIdea(session, map);
        return modelAndView;
    }

    /**
     * 跳转到售后服务页面
     * @return
     */
    @RequestMapping(value = "/afterSales", method = RequestMethod.GET)
    public ModelAndView goToPage1(HttpSession session, Map<String, Object> map) {
        Object userId = session.getAttribute("userId");
        if (userId != null) {
            User user = userService.get(Integer.parseInt(userId.toString()));
            map.put("user", user);
        }

        ModelAndView modelAndView =new ModelAndView("fore/afterSalesPage");
        ideaService.getNewIdea(session, map);
        return modelAndView;
    }

    /**
     * 跳转到关于我们页面
     * @return
     */
    @RequestMapping(value = "/aboutUs", method = RequestMethod.GET)
    public ModelAndView goToPage2(HttpSession session, Map<String, Object> map) {
        Object userId = session.getAttribute("userId");
        if (userId != null) {
            User user = userService.get(Integer.parseInt(userId.toString()));
            map.put("user", user);
        }

        ModelAndView modelAndView =new ModelAndView("fore/aboutUsPage");
        ideaService.getNewIdea(session, map);
        return modelAndView;
    }
//    /**
//     * 获取new idea模块所有信息
//     * @return
//     */
//    @RequestMapping(value = "/getIdea", method = RequestMethod.GET)
//    public RespBean getNewIdea(HttpSession session, Map<String, Object> map){
//        return ideaService.getNewIdea(session, map);
//    }

    /**
     * 添加new idea
     * @param ideaVo,session
     * @param "fore/ideaCircle"
     * @return
     */
    @RequestMapping(value = "/addIdea", method = RequestMethod.POST, produces = "multipart/form-data;charset=utf-8")
    public ModelAndView addIdea(IdeaVo ideaVo, HttpSession session, Map<String, Object> map){

        Object userId = session.getAttribute("userId");
        if (userId != null) {
            User user = userService.get(Integer.parseInt(userId.toString()));
            map.put("user", user);
        }

//        ideaService.getNewIdea(session, map);
        ideaService.addIdea(ideaVo, session);

//        ModelAndView modelAndView = new ModelAndView("fore/ideaCircle");
//        return modelAndView;
        return goToPage(session, map);
    }

}
