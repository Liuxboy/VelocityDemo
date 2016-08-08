package com.github.liuxboy.velocity.demo.test;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;


/**
 * @author wyliuchundong
 * @version 1.0.0
 * @date 2016-08-08 15:03:13
 * @comment BaseCaseTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/META-INF/spring/springMVC-servlet.xml"})
public class BaseCaseTest {
    @Test
    public void test() {
        //拼接参数，发送测试数据
    }
}
