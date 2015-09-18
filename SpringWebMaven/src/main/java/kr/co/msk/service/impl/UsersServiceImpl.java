package kr.co.msk.service.impl;

import java.util.List;

import kr.co.msk.dao.UsersDao;
import kr.co.msk.domain.Users;
import kr.co.msk.service.UsersService;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired SqlSession sql;

	@Override
	public List<Users> getList() {
		return  sql.getMapper(UsersDao.class).getList();
	}

	@Override
	public int getTotCnt() {
		return  sql.getMapper(UsersDao.class).getTotCnt();
	}

}
