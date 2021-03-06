package com.github.wz2cool.elasticsearch.test.query;

import com.github.wz2cool.elasticsearch.starter.properties.ElasticsearchRepositoryProperties;
import com.github.wz2cool.elasticsearch.test.TestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Frank
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TestApplication.class)
public class QueryTest {

    @Resource
    private ElasticsearchRepositoryProperties esRepository;

    @Test
    public void test() {
        final ElasticsearchRepositoryProperties elasticsearchProperties = this.esRepository;
        System.out.println(elasticsearchProperties);
    }
}
