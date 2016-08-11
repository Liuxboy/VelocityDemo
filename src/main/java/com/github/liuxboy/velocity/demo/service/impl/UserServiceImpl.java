package com.github.liuxboy.velocity.demo.service.impl;

import com.github.liuxboy.velocity.demo.domain.User;
import com.github.liuxboy.velocity.demo.service.UserService;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.CalendarDate;
import sun.util.calendar.CalendarSystem;
import sun.util.calendar.CalendarUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Package: com.github.liuxboy.velocity.demo.service.impl <br>
 * Author: liuchundong <br>
 * Date: 2016/8/9 <br>
 * Time: 17:43 <br>
 * Desc: 用户服务接口实现
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUserList() {
        List<User> userList = new ArrayList<User>();
        User aUser;
        {
            aUser = new User();
            aUser.setAge(20);
            aUser.setId(1);
            aUser.setName("王川");
            aUser.setSalary(10088.0101);
            aUser.setBirthday(new Date());
            userList.add(aUser);
        }
        {
            aUser = new User();
            aUser.setAge(33);
            aUser.setId(2);
            aUser.setName("刘飞");
            aUser.setSalary(737383.4599);
            aUser.setBirthday(new Date());
            userList.add(aUser);
        }
        {
            aUser = new User();
            aUser.setAge(23);
            aUser.setId(3);
            aUser.setName("张山");
            aUser.setSalary(939948.2388);
            aUser.setBirthday(new Date());
            userList.add(aUser);
        }
        {
            aUser = new User();
            aUser.setAge(45);
            aUser.setId(4);
            aUser.setName("李娜");
            aUser.setSalary(13434.7890);
            aUser.setBirthday(new Date());
            userList.add(aUser);
        }
        return userList;
    }
}
