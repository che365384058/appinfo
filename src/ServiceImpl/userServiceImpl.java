package ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.User;
import Dao.userMapper;
import Service.userService;
@Service("aaa")
public class userServiceImpl implements userService {
	@Autowired
	private userMapper dao;
	public userMapper getDao() {
		return dao;
	}
	public void setDao(userMapper dao) {
		this.dao = dao;
	}
	
	//查询
	@Override
	public List<User> finduser() {
		// TODO Auto-generated method stub
		return dao.finduser();
	}
	
	//删除
	@Override
	public int deleteuser(int id) {
		// TODO Auto-generated method stub
		return dao.deleteuser(id);
	}
	
	//添加
	@Override
	public int adduser(User user) {
		// TODO Auto-generated method stub
		return dao.adduser(user);
	}
	
	//修改
	@Override
	public int updateuser() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
