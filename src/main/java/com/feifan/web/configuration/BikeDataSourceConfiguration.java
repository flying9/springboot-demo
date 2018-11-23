package com.feifan.web.configuration;

import com.feifan.web.configuration.base.DataSourceConfiguration;
import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * </p>
 * ClassName: BikeDataSourceConfiguration
 * Date: 2018/11/16 下午5:45 <br>
 *
 * @author feifan
 * @version 1.0.0
 * @since JDK 1.8
 */
@ConditionalOnClass(PoolProperties.class)
@Configuration(value = "bikeDataSourceConfiguration")
@ConfigurationProperties(prefix = "datasource.bike")
public class BikeDataSourceConfiguration extends DataSourceConfiguration {
}
