package com.lxy.spring.boot.repository;

import com.lxy.spring.boot.domain.User;

import java.util.List;

/**
 * user repository interface
 */
public interface UserRepository {

    /**
     * create or modify User
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * delete the  User
     * @param id
     */
    void deleteUser(Long id);

    /**
     * get User by Id
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * obtain the User list
     * @return
     */
    List<User> listUser();


}
