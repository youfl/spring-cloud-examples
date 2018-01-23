package com.jja;

import com.jja.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback1 implements UserFeignClient1 {
		@Override
		public Users getUser(int id) {
			Users user = new Users();
			user.setId(0);
			System.out.println("默认姓名1");
			return user;
		}
	}