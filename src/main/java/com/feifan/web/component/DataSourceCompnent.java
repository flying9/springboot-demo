package com.feifan.web.component;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * <p>
 * </p>
 * ClassName: DataSourceCompnent
 * Date: 2018/11/22 下午5:41 <br>
 *
 * @author feifan
 * @version 1.0.0
 * @since JDK 1.8
 */
@Configuration
public class DataSourceCompnent {


    /**
     * 默认数据源
     * <p>
     * 其它数据源 datasource2
     * {@link org.apache.tomcat.jdbc.pool.DataSource} DataSource implements javax.sql.DataSource, 所以直接返回其具体实现类就好了,没必要转型
     *
     * @return {@link org.apache.tomcat.jdbc.pool.DataSource}
     */
    @Primary
    @Bean(name = "datasource")
    @ConfigurationProperties(prefix = "datasource.bike")
    public DataSource dataSource() {
        return new DataSource();
    }

    @Bean(name = "datasource2")
    @ConfigurationProperties(prefix = "datasource.bike2")
    public DataSource dataSource2() {
        return new DataSource();
    }
}
