package egovframework.portal.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import egovframework.portal.home.service.HomeService;
import egovframework.portal.home.vo.UserVO;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	HomeService homeService;
	
	@RequestMapping(value = "/portalHome.do", method = RequestMethod.GET)
	public String Home() throws Exception {
		return "portal/home";
	}

	@GetMapping("/user.do")
	public @ResponseBody List<UserVO> getUserList() {
		List<UserVO> user = homeService.getUserList();
		return user;
	}
}
