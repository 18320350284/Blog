package cn.kee.core.action.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kee.core.action.BaseController;
import cn.kee.core.entity.vo.UploadDemoVo;
import cn.kee.core.exception.ServiceException;
import cn.kee.core.service.UploadDemoService;

@Controller
@RequestMapping("/demo/upload")
public class UploadController extends BaseController {
	
	@Autowired
	private UploadDemoService uploadDemoService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(HttpServletRequest request){
		request.setAttribute("demoType", "uploadDemo");   //返回前台寻找jsp，同时js设置左边的sitebar的导航active的样式
		request.setAttribute("pageTitle", "上传文件系统演示");   //网页标题title
		return "demo/uploadDemo";
	}
	
	/**
	 * 第一种上传，form表单提交文件到一个frame，刷新该frame，页面打印出返回的结果
	 * @param request
	 * @param demo
	 * @return
	 */
	@RequestMapping(value = "firstUpload", method = RequestMethod.POST)
	@ResponseBody
	public Object firstUpload(HttpServletRequest request, UploadDemoVo demo){
		logger.info("firstUpload info:" + demo.toString());
		boolean flag = false;
		String errorMessage = "";
		try{
			flag = uploadDemoService.uploadForm(demo);
			errorMessage += "文件地址：http://demo.codingyun.com/demoFileDirectory/" + demo.getImgFile().getOriginalFilename();
		}catch (ServiceException serviceE){
			logger.error("firstUpload failed!" , serviceE);
			errorMessage = serviceE.getMessage();
		}catch (Exception e){
			logger.error("firstUpload failed!" , e);
			errorMessage = "新增文件失败!";
		}
		if(flag){
			return "<script>window.parent.uploadSucced('" + errorMessage + "');</script>";
		}
		return "<script>window.parent.uploadFailed('" + errorMessage + "');</script>";
	}

}
