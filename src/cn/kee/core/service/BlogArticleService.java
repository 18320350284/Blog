package cn.kee.core.service;

import cn.kee.core.entity.PageBean;
import cn.kee.core.entity.QueryCondition;
import cn.kee.core.entity.bo.BlogArticleBo;
import cn.kee.core.entity.vo.BlogArticleVo;

public interface BlogArticleService {
	
	/**
	 * 博客首页获取文章列表，只显示showFlag为1的，即标记为展示的文章
	 * @user jinhang
	 * 2014年9月25日
	 */
	public PageBean<BlogArticleVo> getArticleList(QueryCondition queryCondition) throws Exception;
	/**
	 * 系统管理员获取文章列表，获取所有文章
	 * @user jinhang
	 * 2014年9月25日
	 */
	public PageBean<BlogArticleVo> getSysArticleList(QueryCondition queryCondition) throws Exception;
	
	/**
	 * 生成所有网页的sitemap.txt文件
	 * @param queryCondition
	 * @return
	 * @throws Exception
	 */
	public boolean siteMapFile(QueryCondition queryCondition) throws Exception;
	
	public PageBean<BlogArticleVo> getTagArticleList(QueryCondition queryCondition, String tag) throws Exception;
	/**
	 * 根据类别查出文章list
	 * @user jinhang
	 * 2015年6月11日
	 */
	public PageBean<BlogArticleVo> getArticleList(int category, QueryCondition queryCondition) throws Exception;
	
	public boolean addArticle(BlogArticleBo article) throws Exception;
	
	public boolean updateArticle(BlogArticleBo article) throws Exception;
	
	public boolean delArticle(int articleId) throws Exception;
	
	public BlogArticleVo getArticleById(int articleId) throws Exception;
	/**
	 * 保存图片
	 * 返回图片存储的url
	 * @user jinhang
	 * 2014年8月22日
	 */
	public String saveArticleImg(BlogArticleVo blogArticleVo) throws Exception;

}
