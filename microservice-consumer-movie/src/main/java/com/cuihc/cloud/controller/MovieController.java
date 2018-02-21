package com.cuihc.cloud.controller;

import com.cuihc.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${user.userServicePath}")
    private String userServicePath;

    @GetMapping("/movie/{id}")
    public User getById(@PathVariable Long id) {
        return this.restTemplate.getForObject(this.userServicePath + id, User.class);
    }
}
