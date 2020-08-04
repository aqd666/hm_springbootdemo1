package cn.jiyun.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration //声明一个类是一个java配置类,相当于一个xml配置文件
//@PropertySource("classpath:jdbc.properties") //读取资源文件
//@EnableConfigurationProperties(JdbcProperties.class)//启用属性读取类
public class JdbcConfiguration {

   /* @Value("${jdbc.driverClassName}")
    private String driverClassName;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;*/






    /*@Autowired
    private JdbcProperties jdbcProperties;*/






   /* private JdbcProperties jdbcProperties;

    public JdbcConfiguration(JdbcProperties jdbcProperties){
        this.jdbcProperties = jdbcProperties;
    }*/








    @Bean  //把方法的返回值注入到spring容器中
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }



}
