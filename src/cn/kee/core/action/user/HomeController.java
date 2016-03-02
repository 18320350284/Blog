package cn.kee.core.action.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.kee.core.action.BaseController;
import cn.kee.core.entity.PageBean;
import cn.kee.core.entity.QueryCondition;
import cn.kee.core.entity.vo.BlogArticleVo;
import cn.kee.core.service.BlogArticleService;

@Controller
@RequestMapping("/user/home")
public class HomeController extends BaseController {
	
	@Autowired
	private BlogArticleService blogArticleService;

	@RequestMapping(value = "siteMap", method = RequestMethod.GET)
	public String siteMap(HttpServletRequest request){
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setPageSize("10000");
		PageBean<BlogArticleVo> articleBean = null;
		try{
			articleBean = blogArticleService.getArticleList(queryCondition);
		}catch(Exception e){
			e.printStackTrace();
		}
		request.setAttribute("articleList", articleBean != null ? articleBean.getDatas() : null);
		logger.info("get article list size:" + articleBean.getDatas().size());
		return "user/siteMap";
	}
	
	@RequestMapping(value = "siteMapFile", method = RequestMethod.GET)
	public void siteMapFile(HttpServletRequest request){
		logger.info("siteMapFile to /alidata/dataFile/sitemap.txt");
		QueryCondition queryCondition = new QueryCondition();
		queryCondition.setPageSize("10000");
		try {
			blogArticleService.siteMapFile(queryCondition);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
