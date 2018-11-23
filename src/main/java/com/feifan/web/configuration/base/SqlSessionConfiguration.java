package com.feifan.web.configuration.base;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * <p>
 * </p>
 * ClassName: SqlSessionConfiguration
 * Date: 2018/11/22 下午6:02 <br>
 *
 * @author feifan
 * @version 1.0.0
 * @since JDK 1.8
 */
@ConditionalOnClass(SqlSessionFactoryBean.class)
@Configuration
@ConfigurationProperties(prefix = "mybatis")
public class SqlSessionConfiguration {

    private String config;
    private String mapperLocations;
    private String typeAliasesPackage;
    private boolean checkConfigLocation;

    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(this.typeAliasesPackage);
        sqlSessionFactoryBean.setConfigLocation(resourcePatternResolver.getResource(this.config));
        sqlSessionFactoryBean.setMapperLocations(resourcePatternResolver.getResources(this.mapperLocations));
        return sqlSessionFactoryBean;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getMapperLocations() {
        return mapperLocations;
    }

    public void setMapperLocations(String mapperLocations) {
        this.mapperLocations = mapperLocations;
    }

    public String getTypeAliasesPackage() {
        return typeAliasesPackage;
    }

    public void setTypeAliasesPackage(String typeAliasesPackage) {
        this.typeAliasesPackage = typeAliasesPackage;
    }

    public boolean isCheckConfigLocation() {
        return checkConfigLocation;
    }

    public void setCheckConfigLocation(boolean checkConfigLocation) {
        this.checkConfigLocation = checkConfigLocation;
    }
}
