package com.github.wz2cool.elasticsearch.test.query;

import com.github.wz2cool.elasticsearch.test.TestApplication;
import com.github.wz2cool.elasticsearch.test.mapper.MyTestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TestApplication.class)
public class ExampleTest {

    @Resource
    private MyTestMapper myTestMapper;

    @Test
    public void test() {
        final String s = myTestMapper.sayHello();
        System.out.println(s);
    }
}
