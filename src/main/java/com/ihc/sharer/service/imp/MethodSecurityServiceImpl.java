package com.ihc.sharer.service.imp;

import org.springframework.security.access.annotation.Secured;

import com.ihc.sharer.service.MethodSecurityService;

public class MethodSecurityServiceImpl implements MethodSecurityService {

	@Override
	@Secured("ROLE_ADMIN")
	public void methodSecurityTest() {
		System.out.println("====method secured test ===");
	}

}
