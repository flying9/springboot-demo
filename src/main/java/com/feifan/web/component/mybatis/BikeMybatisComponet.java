package com.feifan.web.component.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * <p>
 * </p>
 * ClassName: BikeMybatisComponet
 * Date: 2018/11/22 下午5:52 <br>
 *
 * @author feifan
 * @version 1.0.0
 * @since JDK 1.8
 */
@Component
@MapperScan(basePackages = "com.feifan.web.dao", sqlSessionFactoryRef = "bikeSqlSessionFactory")
public class BikeMybatisComponet {
}
