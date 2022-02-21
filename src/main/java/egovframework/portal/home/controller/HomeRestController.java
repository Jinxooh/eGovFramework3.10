package egovframework.portal.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import egovframework.portal.home.service.HomeService;
import egovframework.portal.home.vo.UserVO;

@RestController
@RequestMapping("/rest")
public class HomeRestController {

	@Autowired
	HomeService homeService;
	
	@GetMapping("/user.do")
	public List<UserVO> getUserList() {
		List<UserVO> user = homeService.getUserList();
		return user;
	}
}
