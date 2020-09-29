/**
 * 公司:
 * 文件名:UserController
 * 作者：Tiger
 * 时间：2020/9/16 16:50
 * 描述：
 */
package com.waymap.cloud.userservice.controller;

import com.waymap.cloud.commonservice.common.CommonResult;
import com.waymap.cloud.commonservice.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : tiger
 * @description :
 * @email : tiger.liu@waymap.cn
 * @date : 2020/9/16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/get")
    public CommonResult getUser() {
        User user = new User();
        user.setId(1).setAge(18).setName("傻蛋");
        LOGGER.info("获取用户成功");
        return new CommonResult("获取用户成功", 200, user);
    }

    @RequestMapping("/find/{id}")
    public CommonResult findUser(@PathVariable int id) {
        User user = new User();
        user.setId(id).setName("查询用户").setAge(19);
        return new CommonResult("查询用户成功", 200, user);
    }
}
