package com.feifan.web.configuration.base;

import org.apache.tomcat.jdbc.pool.PoolProperties;

/**
 * <p>
 * </p>
 * ClassName: DataSourceConfiguration
 * Date: 2018/11/16 下午5:46 <br>
 *
 * @author feifan
 * @version 1.0.0
 * @since JDK 1.8
 */
public class DataSourceConfiguration extends PoolProperties {

    private boolean cryptographic;

    public boolean isCryptographic() {
        return cryptographic;
    }

    public void setCryptographic(boolean cryptographic) {
        this.cryptographic = cryptographic;
    }
}
