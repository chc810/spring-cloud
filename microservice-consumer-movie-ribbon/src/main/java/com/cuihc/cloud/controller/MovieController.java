package com.cuihc.cloud.controller;

import com.cuihc.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <dl>
 * <dt>MovieController</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2006</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2018/2/13</dd>
 * </dl>
 *
 * @author cuihc
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")
    public User getById(@PathVariable Long id) {
        //http://localhost:7900/user/id
        //vip virtual ip 如ha
        return this.restTemplate.getForObject("http://microservice-provider-user/user/" + id, User.class);
    }
}
