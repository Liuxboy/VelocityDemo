package com.github.liuxboy.velocity.demo.controller;


import com.github.liuxboy.velocity.demo.domain.User;
import com.github.liuxboy.velocity.demo.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liuchundong
 * Time: 2016-08-08 13:08:27
 */
@Controller
@RequestMapping("/")
public class IndexCtrl {

    private static final Log LOG = LogFactory.getLog(IndexCtrl.class);

    @Resource
    private UserService userService;

    /**
     * 首页
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "index")
    public String index(Model model) {
        model.addAttribute(new User(1, "root", 100));
        try {
            List<User> userList = userService.getUserList();
            if (CollectionUtils.isNotEmpty(userList)) {
                model.addAttribute("dataList", userList);   // 数据集合
            }
        } catch (Exception e) {
            LOG.error(" error index...");
        }

        return "index";
    }
}
