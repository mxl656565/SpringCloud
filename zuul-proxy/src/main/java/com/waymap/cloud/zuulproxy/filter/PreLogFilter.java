/**
 * 公司:
 * 文件名:PreLogFilter
 * 作者：Tiger
 * 时间：2020/9/22 13:39
 * 描述：
 */
package com.waymap.cloud.zuulproxy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : tiger
 * @description :
 * @email : tiger.liu@waymap.cn
 * @date : 2020/9/22
 */
@Component
public class PreLogFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(PreLogFilter.class);

    /**
     * 过滤器类型有四种：pre、post、routing、error
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行顺序,数值越小越先执行
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否进行过滤
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 自定义过滤器执行逻辑
     *
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String remoteHost = request.getRemoteHost();
        String requestURI = request.getRequestURI();
        String method = request.getMethod();
        logger.info("RemoteHost:{},method:{},requestURI:{}", remoteHost, method, requestURI);
        return null;
    }
}
