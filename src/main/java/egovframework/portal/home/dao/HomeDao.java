package egovframework.portal.home.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.portal.home.vo.UserVO;

@Repository
public class HomeDao {

    @Autowired
    private SqlSession SqlSession;
    
    public List<UserVO> getUserList(){
        return SqlSession.selectList("egovframework.portal.home.getUserList");
  }
}
