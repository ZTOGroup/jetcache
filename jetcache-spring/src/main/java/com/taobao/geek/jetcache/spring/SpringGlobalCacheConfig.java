/**
 * Created on  13-10-07 23:27
 */
package com.taobao.geek.jetcache.spring;

import com.taobao.geek.jetcache.CacheProvider;
import com.taobao.geek.jetcache.GlobalCacheConfig;
import com.taobao.geek.jetcache.impl.CacheInvokeContext;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

/**
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
public class SpringGlobalCacheConfig extends GlobalCacheConfig implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public SpringGlobalCacheConfig(Map<String, CacheProvider> providerMap) {
        super(providerMap);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public CacheInvokeContext createCacheInvokeContext() {
        return new SpringCacheInvokeContext(applicationContext);
    }
}
