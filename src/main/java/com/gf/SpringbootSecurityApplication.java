package com.gf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//参考：https://mp.weixin.qq.com/s?__biz=MzI0NTYzMjM0Ng==&mid=2247484315&idx=1&sn=122655740e497e57fa7a5c5c93d15ef4

/**
 * 总体思路：1.在Spring容器一初始化的时候就通过MyInvocationSecurityMetadataSourceService将可以访问的权限字符串和角色放入map中以便后续查询使用
 *         2.SpringSecurity是基于WEB 的Servelet filter和aop的思路，只要有请求访问的话就会调用MyFilterSecurityInterceptor的doFileter方法，在该方法
 *         内通过beforeInvocation，afterInvocation等方法持有的MyAccessDecisionManager来鉴定用户是否有访问对应资源（方法或URL）的权限
 */
@SpringBootApplication
public class SpringbootSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run( SpringbootSecurityApplication.class, args );
    }

}
