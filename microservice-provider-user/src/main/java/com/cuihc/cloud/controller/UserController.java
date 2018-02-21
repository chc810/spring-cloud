package com.cuihc.cloud.controller;

import com.cuihc.cloud.entity.User;
import com.cuihc.cloud.repository.UserRepository;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <dl>
 * <dt>UserController</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2006</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2018/2/13</dd>
 * </dl>
 *
 * @author cuihc
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.findOne(id);
    }

    @GetMapping("/user/service-url")
    public String serviceUrl() {
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("MICROSERVICE-CONSUMER-MOVIE",false);
        return instanceInfo.getHomePageUrl();
    }
}
