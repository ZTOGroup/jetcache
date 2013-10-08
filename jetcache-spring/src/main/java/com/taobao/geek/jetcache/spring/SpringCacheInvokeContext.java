/**
 * Created on  13-10-07 23:25
 */
package com.taobao.geek.jetcache.spring;

import com.taobao.geek.jetcache.impl.CacheInvokeContext;
import org.springframework.context.ApplicationContext;

/**
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
public class SpringCacheInvokeContext extends CacheInvokeContext {
    private ApplicationContext context;

    public SpringCacheInvokeContext(ApplicationContext context) {
        this.context = context;
    }

    public Object bean(String name) {
        return context.getBean(name);
    }
}
