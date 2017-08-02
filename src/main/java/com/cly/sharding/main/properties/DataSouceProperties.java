package com.cly.sharding.main.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Filename DataSouceProperties.java
 * @description 数据源配置属性
 * @Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/1 18:32</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSouceProperties {

    /** 数据库url */
    private String url;

    /** 用名 */
    private String username;

    /** 密码 */
    private String password;

    /**
     * 初始化时建立物理连接的个数。初始化发生在显示调用init方法，或者第一次getConnection时
     * 缺省值：0
     * 建议值：1
     */
    private Integer initialSize;

    /**
     * 最小连接池数量
     * 缺省值：0
     * 建议值：1
     */
    private Integer minIdle ;

    /**
     * 最大连接池数量
     * 缺省值：8
     * 建议值：100
     */
    private Integer maxActive ;

    /**
     * 获取连接时最大等待时间，单位毫秒。
     * 配置了maxWait之后，缺省启用公平锁，并发效率会有所下降，如果需要可以通过配置useUnfairLock属性为true使用非公平锁。
     * 缺省值：-1
     * 建议值：60000
     */
    private Long maxWait ;

    /**
     * 是否缓存preparedStatement，也就是PSCache。
     * PSCache对支持游标的数据库性能提升巨大，比如说oracle。在mysql下建议关闭。
     * 缺省值：false
     * 建议值：false
     */
    private Boolean poolPreparedStatements;

    /**
     * 用来检测连接是否有效的sql，要求是一个查询语句，常用select 'x'。
     * 如果validationQuery为null，testOnBorrow、testOnReturn、testWhileIdle都不会其作用。
     */
    private String validationQuery;

    /**
     * 申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
     * 缺省值：false
     * 建议值：false
     */
    private Boolean testOnBorrow;

    /**
     * 归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
     * 缺省值：false
     * 建议值：false
     */
    private Boolean testOnReturn;

    /**
     * 建议配置为true，不影响性能，并且保证安全性。
     * 申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
     * 缺省值：true
     * 建议值：true
     */
    private Boolean testWhileIdle;

    /**
     * 慢sql日志阈值，超过此值则打印日志
     */
    private Integer slowSql ;

    /**
     * 闲置检测时间
     * 有两个含义：
     1) Destroy线程会检测连接的间隔时间，如果连接空闲时间大于等于minEvictableIdleTimeMillis则关闭物理连接。
     2) testWhileIdle的判断依据，详细看testWhileIdle属性的说明
     缺省值：60 * 1000L
     建议值：60000
     */
    private Long timeBetweenEvictionRunsMillis;

    /**
     * 连接保持空闲而不被驱逐的最长时间
     * 缺省值：1000L * 60L * 30L
     * 建议值：300000
     */
    private Long minEvictableIdleTimeMillis;

    /**
     * statement池能够同时分配的打开的statements的最大数量
     */
    private Integer maxOpenPreparedStatements;

    /**
     * 属性类型是字符串，通过别名的方式配置扩展插件，常用的插件有：
     * Druid内置提供一个StatFilter，用于统计监控信息
     监控统计用的filter:stat
     日志用的filter:log4j
     防御sql注入的filter:wall
     */
    private String filters;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(Integer initialSize) {
        this.initialSize = initialSize;
    }

    public Integer getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(Integer minIdle) {
        this.minIdle = minIdle;
    }

    public Integer getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(Integer maxActive) {
        this.maxActive = maxActive;
    }

    public Long getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(Long maxWait) {
        this.maxWait = maxWait;
    }

    public Boolean getPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    public void setPoolPreparedStatements(Boolean poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    public Boolean getTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(Boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public Boolean getTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(Boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public Boolean getTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(Boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public Integer getSlowSql() {
        return slowSql;
    }

    public void setSlowSql(Integer slowSql) {
        this.slowSql = slowSql;
    }

    public Long getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(Long timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public Long getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(Long minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    public Integer getMaxOpenPreparedStatements() {
        return maxOpenPreparedStatements;
    }

    public void setMaxOpenPreparedStatements(Integer maxOpenPreparedStatements) {
        this.maxOpenPreparedStatements = maxOpenPreparedStatements;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }


}
