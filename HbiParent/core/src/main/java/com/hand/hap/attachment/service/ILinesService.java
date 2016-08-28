package com.hand.hap.attachment.service;

import java.util.List;

import com.hand.hap.attachment.dto.Lines;
import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

public interface ILinesService extends IBaseService<Lines>, ProxySelf<ILinesService>{ 
	List<Lines> selectOrderLine(IRequest requestContext, Lines orderline,int page, int pagesize);
}