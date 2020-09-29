/**
 * 公司:
 * 文件名:User
 * 作者：Tiger
 * 时间：2020/9/16 16:54
 * 描述：
 */
package com.waymap.cloud.commonservice.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author : tiger
 * @description :
 * @email : tiger.liu@waymap.cn
 * @date : 2020/9/16
 */
@Data
@Accessors(chain = true)
public class User {
    private int id;
    private String name;
    private int age;
}
