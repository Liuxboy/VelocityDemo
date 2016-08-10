package com.github.liuxboy.velocity.demo.service;

import com.github.liuxboy.velocity.demo.domain.User;

import java.util.List;

/**
 * Package: com.github.liuxboy.velocity.demo.service <br>
 * Author: liuchundong <br>
 * Date: 2016/8/9 <br>
 * Time: 17:42 <br>
 * Desc: 用户服务接口
 */
public interface UserService {
    /**
     *
     * @return
     */
    List<User> getUserList();
}
