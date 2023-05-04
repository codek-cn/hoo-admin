package top.codehoo.job;

import top.codehoo.common.security.annotation.EnableCustomConfig;
import top.codehoo.common.security.annotation.EnableRyFeignClients;
import top.codehoo.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 定时任务
 * 
 * @author ruoyi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients   
@SpringBootApplication
public class HooJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(HooJobApplication.class, args);
    }
}
