package com.github.wz2cool.elasticearch.starter.autoconfigure;

import com.github.wz2cool.elasticearch.starter.properties.ElasticsearchRepositoryProperties;
import com.github.wz2cool.elasticsearch.repository.support.ElasticsearchExtRepositoryFactoryBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @author Frank
 **/
@Configuration
@EnableConfigurationProperties(ElasticsearchRepositoryProperties.class)
@EnableElasticsearchRepositories(basePackages = "${elasticsearch.repository-base-packages:com.*}",
        repositoryFactoryBeanClass = ElasticsearchExtRepositoryFactoryBean.class)
public class ElasticsearchDynamicQueryAutoConfigure {


}
