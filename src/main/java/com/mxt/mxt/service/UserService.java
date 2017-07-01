package com.mxt.mxt.service;

import com.mxt.mxt.dao.UserRepository;
import com.mxt.mxt.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void createUser(String name) {
        userRepository.save(new TbUser(name));
    }

    public List<TbUser> getAllUser(Integer page, Integer size) {
        Sort sort = new Sort(Sort.Direction.DESC, "createTime");
        Pageable pageable = new PageRequest(page, size, sort);
        Page<TbUser> a = userRepository.findAll(pageable);
        System.out.println(a.getTotalPages());
        System.out.println(a.getTotalElements());
        List<TbUser> list = a.getContent();
        return list;
    }

    public TbUser getUser(Long id) {
        TbUser user = userRepository.getOne(id);
        return user;
    }

}
