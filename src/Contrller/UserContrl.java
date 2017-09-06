package Contrller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.User;

import Service.userService;

@Controller
public class UserContrl {
	@Resource	
	private userService aaa; //和serviceimpl里面的注解名字相同@Service("aaa")
	public userService getAaa() {
		return aaa;
	}
	public void setAaa(userService aaa) {
		this.aaa = aaa;
	}
	//查询
	@RequestMapping(value="/find.html")  //请求
	public String index(Model model) {
		List<User> allinfo = aaa.finduser();
		model.addAttribute("allinfo", allinfo);
		return "index";
	}
	//删除
	@RequestMapping("/delete.html/{id}")
	public String delete(@PathVariable int id){
		int re=aaa.deleteuser(id);
		if(re>0)
		{
			return "redirect:/find.html";
		}
		else
		{
			return "index";
		}			
	}
	
	
	//添加
	
	//点击添加跳到addUser.jsp页面添加信息
	@RequestMapping("/addUserinfo.html/")
	public String adduser(@ModelAttribute("user") User user){		
		return "addUser";
	}
	//操作数据库   添加入数据库
	@RequestMapping("/addUser.html/{user}")
	public String add(@PathVariable User user){
		int result = aaa.adduser(user);
		if (result>0) {
			return "redirect:/find.html";
		}else {
			return "addUser";
		}
	}
	
	}

