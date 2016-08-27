package com.hand.hap.attachment.mapper;

import com.hand.hap.attachment.dto.Headers;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;


/**
 * @author taotao.xu@hand-china.com
 */
public interface OrderHeaderMapper extends Mapper<Headers> {
	//注意这个selectByCustomers方法被lov中的那个
    List<Headers> selectByOrderHeader(Headers headers);
    
    int insertHeaders(Headers headers);
    
    int updateHeaders(Headers headers);
    
    int deleteHeaders(Headers headers);

}
