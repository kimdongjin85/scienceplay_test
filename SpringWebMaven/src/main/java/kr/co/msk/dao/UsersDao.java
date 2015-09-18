 
package kr.co.msk.dao;

import java.util.List;

import kr.co.msk.domain.Users;

public interface UsersDao {

	public List<Users> getList();
	
	public int getTotCnt();
 
}
