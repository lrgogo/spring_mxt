package com.mxt.mxt.dao;

import com.mxt.mxt.pojo.TbUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/7/1.
 */
public interface UserRepository extends JpaRepository<TbUser, Long> {

    Page<TbUser> findAll(Pageable pageable);

    TbUser findById(Long id);

}
