package com.feifan.web.component;

import com.feifan.web.configuration.base.DataSourceConfiguration;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

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
@Component
public class DataSourceCompnent {

    @Bean
    public javax.sql.DataSource bikeDataSource(@Qualifier("bikeDataSourceConfiguration")DataSourceConfiguration dataSourceConfiguration){
        return getDataSource(dataSourceConfiguration);
    }

    private javax.sql.DataSource getDataSource(DataSourceConfiguration dataSourceConfiguration){
        DataSource dataSource = new DataSource();
        dataSource.setPoolProperties(dataSourceConfiguration);
        return dataSource;
    }
}
