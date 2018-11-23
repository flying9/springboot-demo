package com.feifan.web.component.mybatis;

import com.feifan.web.configuration.base.SqlSessionConfiguration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * <p>
 * </p>
 * ClassName: SqlSessionFactoryComponent
 * Date: 2018/11/22 下午5:58 <br>
 *
 * @author feifan
 * @version 1.0.0
 * @since JDK 1.8
 */
@Component
public class SqlSessionFactoryComponent {

    @Bean
    public SqlSessionFactory bikeSqlSessionFactory(@Qualifier("bikeDataSource")DataSource dataSource,
                                                   SqlSessionConfiguration sqlSessionConfiguration) throws Exception {
        return sqlSessionConfiguration.getSqlSessionFactoryBean(dataSource).getObject();
    }
}
