package com.github.wz2cool.elasticsearch.starter.autoconfigure;

import com.github.wz2cool.elasticsearch.starter.properties.ElasticsearchRepositoryProperties;
import com.github.wz2cool.elasticsearch.repository.ElasticsearchExtRepository;
import com.github.wz2cool.elasticsearch.repository.support.ElasticsearchExtRepositoryFactoryBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @author Frank
 **/
@Configuration
@EnableConfigurationProperties(ElasticsearchRepositoryProperties.class)
@EnableElasticsearchRepositories(basePackages = "${elasticsearch.repository-base-packages:com.*}",
        includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = ElasticsearchExtRepository.class),
        repositoryFactoryBeanClass = ElasticsearchExtRepositoryFactoryBean.class)
public class ElasticsearchDynamicQueryAutoConfigure {


}
