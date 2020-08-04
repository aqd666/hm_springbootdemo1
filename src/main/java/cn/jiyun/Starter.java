package cn.jiyun;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration//启用springboot应用的自动配置
//扫描该类所在的包,以及该类下的子包
//@ComponentScan  //类似于原来的xml配置文件中的component-scan标签
@SpringBootApplication //组合注解,相当于@EnableAutoConfiguration和@ComponentScan和@SpringBootConfiguration三个注解的结合体
public class Starter {

    public static void main(String[] args) {
        SpringApplication.run(Starter.class,args);
    }
}
