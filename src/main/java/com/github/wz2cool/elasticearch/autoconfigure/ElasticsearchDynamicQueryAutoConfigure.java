package com.github.wz2cool.elasticearch.autoconfigure;

import com.github.wz2cool.elasticearch.service.TestService;
import com.github.wz2cool.elasticsearch.repository.ElasticsearchExtRepository;
import com.github.wz2cool.elasticsearch.repository.support.SimpleElasticsearchExtRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

/**
 * @author Frank
 **/
@Configuration
@ConditionalOnClass(SimpleElasticsearchExtRepository.class)
public class ElasticsearchDynamicQueryAutoConfigure {


    @ConditionalOnBean(ElasticsearchTemplate.class)
    @Bean
    public <T, I> ElasticsearchExtRepository<T, I> elasticsearchExtRepository(ElasticsearchTemplate elasticsearchTemplate) {
        return new SimpleElasticsearchExtRepository<>(elasticsearchTemplate);
    }

    @Bean
    public TestService testService() {
        return new TestService();
    }
}
