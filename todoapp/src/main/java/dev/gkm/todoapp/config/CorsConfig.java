//用来解决前后端分离后，带来的跨域问题，也就是分离后，前后端不同域名不能访问,
// 要用Cors使得指定的域名间能够进行访问

package dev.gkm.todoapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//spring 配置类
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    //配置cors跨域映射
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}