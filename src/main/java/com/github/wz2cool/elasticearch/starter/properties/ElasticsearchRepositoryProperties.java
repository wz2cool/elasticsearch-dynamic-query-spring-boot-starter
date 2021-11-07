package com.github.wz2cool.elasticearch.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Frank
 **/
@ConfigurationProperties(prefix = "elasticsearch")
public class ElasticsearchRepositoryProperties {

    private String repositoryBasePackages;

    public String getRepositoryBasePackages() {
        return repositoryBasePackages;
    }

    public void setRepositoryBasePackages(String repositoryBasePackages) {
        this.repositoryBasePackages = repositoryBasePackages;
    }
}
