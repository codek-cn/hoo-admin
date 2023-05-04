package top.codehoo.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.codehoo.common.security.annotation.EnableCustomConfig;
import top.codehoo.common.security.annotation.EnableRyFeignClients;
import top.codehoo.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 * 
 * @author ruoyi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class HooGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(HooGenApplication.class, args);
    }
}
