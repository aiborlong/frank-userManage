package cn.frank.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("user")
@Controller
public class UserController {

	@RequestMapping(value = "users", method = RequestMethod.GET)
	public String toUsers() {
		return "users";
	}

}
