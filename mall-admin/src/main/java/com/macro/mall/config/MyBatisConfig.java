package com.macro.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by macro on 2019/4/8.
 * 用于配置需要动态生成的mapper接口的路径
 *
 * @EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
 * @MapperScan：可以指定要扫描的Mapper类的包的路径，且支持多个包路径。这样就不用每个mapper加注解了。
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.macro.mall.mapper","com.macro.mall.dao"})
public class MyBatisConfig {
}
