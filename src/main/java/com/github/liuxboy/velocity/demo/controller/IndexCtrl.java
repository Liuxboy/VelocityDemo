package com.github.liuxboy.velocity.demo.controller;


import com.github.liuxboy.velocity.demo.domain.User;
import com.github.liuxboy.velocity.demo.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liuchundong
 * Time: 2016-08-08 13:08:27
 */
@Controller
@RequestMapping("")
public class IndexCtrl {

    private static final Log LOG = LogFactory.getLog(IndexCtrl.class);

    @Resource
    private UserService userService;

    /**
     * 视图前缀
     */
    private static final String viewPrefix = "customer";

    /**
     * 首页
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "index")
    public String index(Model model) {
        model.addAttribute(new User(1, "root", 100));
        return "index";
    }

    /**
     * 查询商家详细信息
     *
     * @return
     */
    @RequestMapping(value = "query", method = RequestMethod.GET)
    public String query(Model model) {
        try {
            List<User> userList = userService.getUserList();
            if (CollectionUtils.isNotEmpty(userList)) {
                model.addAttribute("dataList", userList);   // 数据集合
            }
        } catch (Exception e) {
            LOG.error("query list of customer has error.", e);
        }
        return viewPrefix + "/detail";
    }
}
