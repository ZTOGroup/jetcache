/**
 * Created on  13-10-07 23:30
 */
package com.taobao.geek.jetcache.spring.beans;

import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
@Component
public class ConfigBean {
    public boolean returnTrue() {
         return true;
    }

    public boolean returnFalse() {
        return false;
    }
}
