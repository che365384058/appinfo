package Service;

import java.util.List;

import pojo.User;

public interface userService {
	
	public List<User> finduser(); 	  //查询用户
	public int deleteuser(int id);	  //删除用户
	public int adduser(User user);	  //添加用户
	public int updateuser();	      //添加用户
}
