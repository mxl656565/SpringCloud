/**
 * 公司:
 * 文件名:FeignConfig
 * 作者：Tiger
 * 时间：2020/9/22 10:01
 * 描述：
 */
package com.waymap.cloud.feignservice.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : tiger
 * @description :
 * @email : tiger.liu@waymap.cn
 * @date : 2020/9/22
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
