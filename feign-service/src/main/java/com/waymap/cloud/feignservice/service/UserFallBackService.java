/**
 * 公司:
 * 文件名:UserFallBackService
 * 作者：Tiger
 * 时间：2020/9/22 9:42
 * 描述：
 */
package com.waymap.cloud.feignservice.service;

import com.waymap.cloud.commonservice.common.CommonResult;
import com.waymap.cloud.commonservice.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author : tiger
 * @description :
 * @email : tiger.liu@waymap.cn
 * @date : 2020/9/22
 */
@Component
public class UserFallBackService implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserFallBackService.class);

    @Override
    public CommonResult getUser() {
        User user = new User();
        user.setName("默认名").setAge(1).setId(123);
        logger.info("成功执行降级方法");
        return new CommonResult("进行降级", 200, user);
    }
}
