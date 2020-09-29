/**
 * 公司:
 * 文件名:UserService
 * 作者：Tiger
 * 时间：2020/9/21 9:17
 * 描述：
 */
package com.waymap.cloud.feignservice.service;

import com.waymap.cloud.commonservice.common.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : tiger
 * @description :
 * @email : tiger.liu@waymap.cn
 * @date : 2020/9/21
 */
@FeignClient(value = "user-service", fallback = UserFallBackService.class)
public interface UserService {
    @GetMapping("/user/get")
    CommonResult getUser();
}
