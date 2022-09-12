
package com.lxy.spring.boot.service;

import com.lxy.spring.boot.domain.Authority;
import com.lxy.spring.boot.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Authority 服务.
 *
 */
@Service
public class AuthorityServiceImpl  implements AuthorityService{
	
	@Autowired
	private AuthorityRepository authorityRepository;

	@Override
	public Authority getAuthorityById(Long id) {
		return authorityRepository.findById(id).orElse(null);
	}

}
