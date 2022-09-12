package com.lxy.spring.boot.repository;

import com.lxy.spring.boot.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * user repository interface
 */
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * 根据用户名分页查询用户列表
     * @param name
     * @param pageable
     * @return
     */
    Page<User> findByNameLike(String name, Pageable pageable);

    /**
     * 根据用户账号查询
     * @param username
     * @return
     */
    User findByUsername(String username);

}
