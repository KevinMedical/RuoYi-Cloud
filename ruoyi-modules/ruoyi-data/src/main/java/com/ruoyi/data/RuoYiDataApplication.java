package com.ruoyi.data;

import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统模块
 * 
 * @author ruoyi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class RuoYiDataApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RuoYiDataApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  数据管理模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "██╗  ██╗███████╗██╗   ██╗██╗███╗   ██╗\n" +
                "██║ ██╔╝██╔════╝██║   ██║██║████╗  ██║\n" +
                "█████╔╝ █████╗  ██║   ██║██║██╔██╗ ██║\n" +
                "██╔═██╗ ██╔══╝  ╚██╗ ██╔╝██║██║╚██╗██║\n" +
                "██║  ██╗███████╗ ╚████╔╝ ██║██║ ╚████║\n" +
                "╚═╝  ╚═╝╚══════╝  ╚═══╝  ╚═╝╚═╝  ╚═══╝\n");
    }
}
