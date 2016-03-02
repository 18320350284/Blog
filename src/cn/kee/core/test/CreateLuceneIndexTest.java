package cn.kee.core.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.kee.core.entity.QueryCondition;
import cn.kee.core.entity.bo.BlogArticleBo;
import cn.kee.core.entity.vo.BlogArticleVo;
import cn.kee.core.service.BlogArticleService;
import cn.kee.core.util.LuceneIndexUtil;

@ContextConfiguration(locations = {"classpath*:/META-INF/jdbc-context.xml","classpath*:/META-INF/springMvc3-servlet.xml"})  
public class CreateLuceneIndexTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	private BlogArticleService blogArticleService;

	@Test
	public void test() throws Exception{
		QueryCondition queryCondition = new QueryCondition();
		List<BlogArticleVo> articleList = blogArticleService.getSysArticleList(queryCondition).getDatas();
		for(BlogArticleBo article : articleList){
			LuceneIndexUtil.createLuceneIndex(
					"F:\\lucene-4.10.2\\test", 
					article, 
					false);
		}
		System.out.println(articleList.size());
	}

}
