package cn.kee.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kee.core.constant.ConstantUtil;
import cn.kee.core.entity.vo.UploadDemoVo;
import cn.kee.core.service.UploadDemoService;
import cn.kee.core.service.UploadFileService;

@Service
public class UploadDemoServiceImpl implements UploadDemoService {
	
	@Autowired
	private UploadFileService uploadFileService;

	@Override
	public boolean uploadForm(UploadDemoVo demo) throws Exception {
		demo.validateFile();
		uploadFileService.uploadFile(
				ConstantUtil.DATA_REAL_PATH_DEMO_DEMOFILE, demo.getImgFile(), demo.getImgFile().getOriginalFilename());
		return true;
	}

}
