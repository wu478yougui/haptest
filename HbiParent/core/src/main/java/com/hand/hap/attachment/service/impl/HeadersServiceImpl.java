package com.hand.hap.attachment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.attachment.dto.Headers;
import com.hand.hap.attachment.mapper.OrderHeaderMapper;
import com.hand.hap.attachment.service.IHeadersService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

@Service
public class HeadersServiceImpl extends BaseServiceImpl<Headers> implements IHeadersService{
	
	 @Autowired
	 private OrderHeaderMapper orderHeaderMapper;
	 
	@Override
	public List<Headers> selectByHeaders(IRequest requestContext, Headers headers, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return orderHeaderMapper.selectByOrderHeader(headers);
	}

	@Override
	//@Transactional这个注解表示此方法运用事务
	//SUPPORTS：支持当前事务，如果当前没有事务，就以非事务方式执行。 
	@Transactional(propagation = Propagation.SUPPORTS)
    public void batchUpdate(IRequest requestContext, Headers headers){
        // TODO Auto-generated method stub
            if (headers!= null) {
            	System.out.println(headers.toString());
                	orderHeaderMapper.insertHeaders(headers);
            }
    }
	
	

}
