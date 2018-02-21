package com.cuihc.cloud.repository;

import com.cuihc.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <dl>
 * <dt>UserRepository</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2006</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2018/2/13</dd>
 * </dl>
 *
 * @author cuihc
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
