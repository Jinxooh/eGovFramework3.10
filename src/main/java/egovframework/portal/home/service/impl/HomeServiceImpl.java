package egovframework.portal.home.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.portal.home.dao.HomeDao;
import egovframework.portal.home.service.HomeService;
import egovframework.portal.home.vo.UserVO;

@Repository
public class HomeServiceImpl implements HomeService {
      
	  @Autowired
	  HomeDao homeDao;

	@Override
	public List<UserVO> getUserList() {
		// TODO Auto-generated method stub
		return homeDao.getUserList();
	}
}