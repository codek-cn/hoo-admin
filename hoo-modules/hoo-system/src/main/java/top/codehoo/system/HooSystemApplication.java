package top.codehoo.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.codehoo.common.security.annotation.EnableCustomConfig;
import top.codehoo.common.security.annotation.EnableRyFeignClients;
import top.codehoo.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author ruoyi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class HooSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(HooSystemApplication.class, args);
    }
}
