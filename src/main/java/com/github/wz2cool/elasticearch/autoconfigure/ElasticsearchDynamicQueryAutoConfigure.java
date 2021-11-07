package com.github.wz2cool.elasticearch.autoconfigure;

import com.github.wz2cool.elasticsearch.repository.support.ElasticsearchExtRepositoryFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @author Frank
 **/
@Configuration
@EnableElasticsearchRepositories(basePackages = {"com.*"},
        repositoryFactoryBeanClass = ElasticsearchExtRepositoryFactoryBean.class)
public class ElasticsearchDynamicQueryAutoConfigure {

}
