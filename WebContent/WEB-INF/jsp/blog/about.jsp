<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<!DOCTYPE html>
<html lang="zh-cn" xmlns:wb="http://open.weibo.com/wb">
  <head>
    <meta charset="utf-8">
	<title>关于我</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content=“">
	<meta name="keywords" content="Bootstrap,java web,spring mvc,nginx,阿里云">
	<meta name="author" content="博客">
	<meta name="application-name" content="">
	
	<!-- Site CSS -->
	<link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
	<link href="/static/Font-Awesome-3.2.1/css/font-awesome.min.css" rel="stylesheet">
	<link href="/static/css/common/site.css" rel="stylesheet">
	<link href="/static/css/blog/blog.css" rel="stylesheet">
	<!-- Favicons -->
	<link rel="apple-touch-icon-precomposed" href="http://system.yingshibao.com/userDirectory/resource-file/user/image/Coding.png">
	<link rel="shortcut icon" href="http://system.yingshibao.com/userDirectory/resource-file/user/image/Coding.png">
  </head>

  <body>
  
    <jsp:include page="common/topSideBar.jsp" />
    <!-- Subhead
	================================================== -->
	<header class="jumbotron subhead">
	  <div class="container">
	    <h1>关于博客</h1>
	    <p class="lead">记录成长</p>
	  </div>
	</header>

    <div class="container">

	    <!-- Docs nav
	    ================================================== -->
	    <div class="row">
	      <div class="col-md-3 ">
	        <div id="toc" class="bc-sidebar">
	          
	        </div>
	      </div>
	
	      <div class="col-md-9">
	        <article class="post page">
	        	<section class="post-content">
	                <h2 id="">关于</h2>
	
		<p>我是一个在读小硕，西安电子科技大学软件工程专业。</p>
	            <p>记录笔记是很值得保持的优秀习惯，搭建这个博客就是为了能记录下自己的笔记。</p>
	            <p>熟悉spring mvc、spring boot mybatis、jooq、hadoop、spark等技术</p>
	            <p>渣渣的成长需要记录下来,那么就开始吧，路漫漫其修远兮，吾将上下而求索。</p>
	            <blockquote>
	              <p>正所谓实践出真知，不以提高coding能力的活动都是耍流氓！</p>
	            </blockquote>
	
	
				<h2 id="">联系我</h2>
				<p></p>
				<p>QQ: 2238481706 <br />
				Mail: 2238481706@qq.com</p>
	            </section>
	        </article>
	      </div>
	    </div>

    </div><!-- /.container -->

    <jsp:include page="common/footerSideBar.jsp" />

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- 请首先引用jquery，再引用其他js文件 -->
<!--     <script type="text/javascript" src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script> -->
<!--     <script type="text/javascript" src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> -->
<%--     <script type="text/javascript" src="${baseUrlStatic}/js/common/commonFunc.js"></script> --%>
<%--     <script type="text/javascript" src="${baseUrlStatic}/js/system/index.js"></script> --%>
    
    <!-- Placed at the end of the document so the pages load faster -->
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<script src="http://cdn.bootcss.com/unveil/1.3.0/jquery.unveil.min.js"></script>
	<script src="http://cdn.bootcss.com/scrollup/2.4.0/jquery.scrollUp.min.js"></script>
	<script src="http://cdn.bootcss.com/toc/0.3.2/toc.min.js"></script>
	<script src="http://static.bootcss.com/www/assets/js/site.min.js"></script>
    <!-- Placed at the end of the document so the pages load faster -->
    <script type="text/javascript">
	    $(document).ready(function(){
	    	$("#blog-masthead").find('a').removeClass('active');
	    	$("#blog-masthead .blog-nav .about").addClass('active');
	    });
    </script>
  </body>
</html>

