package cn.kee.core.service;

import java.util.List;

import cn.kee.core.entity.vo.AlipayEventUserVo;

/**
 * coding活动
 * @author jinhang
 * 2015年5月15日
 */
public interface CodingEventService {
	
	/**
	 * 获取付款用户list
	 * @user jinhang
	 * 2015年5月15日
	 */
	public List<AlipayEventUserVo> getAlipayEventList() throws Exception;

}
