package com.cuihc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <dl>
 * <dt>EurekaApplication</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2006</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2018/2/13</dd>
 * </dl>
 *
 * @author cuihc
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public  static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
