/**
 * 公司:
 * 文件名:UserController
 * 作者：Tiger
 * 时间：2020/9/21 16:28
 * 描述：
 */
package com.waymap.cloud.feignservice.controller;

import com.waymap.cloud.commonservice.common.CommonResult;
import com.waymap.cloud.feignservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : tiger
 * @description :
 * @email : tiger.liu@waymap.cn
 * @date : 2020/9/21
 */
@RestController
@RequestMapping("/user")
@SuppressWarnings("all")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public CommonResult getUser() {

        return userService.getUser();
    }

}
