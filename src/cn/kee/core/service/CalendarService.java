package cn.kee.core.service;

import java.util.Date;
import java.util.List;

import cn.kee.core.entity.bo.CalendarBo;
import cn.kee.core.entity.vo.CalendarQueryVo;

public interface CalendarService {
	
	public List<CalendarBo> getCalendar(Date startTime, Date endTime) throws Exception;
	
	public int quickAdd(CalendarQueryVo calendar) throws Exception;
	
	public boolean quickUpdate(CalendarQueryVo calendar) throws Exception;
	
	public boolean quickDel(int calendarId) throws Exception;

}
