package com.lxy.spring.boot.service;


import com.lxy.spring.boot.domain.Authority;

/**
 * Authority 服务接口.
 */
public interface AuthorityService {
	/**
	 * 根据id获取 Authority
	 */
	Authority getAuthorityById(Long id);
}
