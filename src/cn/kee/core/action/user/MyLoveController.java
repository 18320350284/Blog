package cn.kee.core.action.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.kee.core.entity.QueryCondition;

@Controller
@RequestMapping("/user/mylove")
public class MyLoveController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getLove(HttpServletRequest request, QueryCondition queryCondition) throws Exception{
		return "test/mylove";
	}

}
