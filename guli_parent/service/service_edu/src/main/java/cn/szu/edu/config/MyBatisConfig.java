package cn.szu.edu.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description
 * @Author yajun
 * @Date 2022/8/1
 * @Version 1.0
 */
@MapperScan("cn.szu.edu.mapper")
@EnableTransactionManagement
@Configuration
public class MyBatisConfig {
//    @Bean
//    public ISqlInjector sqlInjector(){
//        return  new LogicSqlInjector();
//    }
    @Bean
    public PaginationInnerInterceptor paginationInterceptor() {
        return new PaginationInnerInterceptor();
}
}
