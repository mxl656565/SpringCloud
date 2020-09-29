/**
 * 公司:
 * 文件名:CommonResult
 * 作者：Tiger
 * 时间：2020/9/16 16:50
 * 描述：
 */
package com.waymap.cloud.commonservice.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : tiger
 * @description :
 * @email : tiger.liu@waymap.cn
 * @date : 2020/9/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult {
    private String message;
    private int code;
    private Object data;

    public CommonResult(String message) {
        this.message = message;
    }

    public CommonResult(String message, int code) {
        this.message = message;
        this.code = code;
    }
}
