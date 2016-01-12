package com.ihc.sharer.service;

import org.springframework.security.access.annotation.Secured;
public interface MethodSecurityService {
	@Secured("ROLE_ADMIN")
	public void methodSecurityTest();
}
