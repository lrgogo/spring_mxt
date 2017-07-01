package com.mxt.mxt.dao;

import com.mxt.mxt.pojo.TbUser;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/7/1.
 */
@CacheConfig(cacheNames = "users")
public interface UserRepository extends JpaRepository<TbUser, Long> {

    Page<TbUser> findAll(Pageable pageable);

    @CachePut(key = "id")
    TbUser findById(Long id);

}
