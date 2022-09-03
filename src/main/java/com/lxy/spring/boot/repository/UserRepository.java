package com.lxy.spring.boot.repository;

import com.lxy.spring.boot.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * user repository interface
 */
public interface UserRepository extends CrudRepository<User,Long> {


}
