package com.hand.hap.attachment.mapper;

import com.hand.hap.attachment.dto.Companys;
import com.hand.hap.attachment.dto.Customers;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;


/**
 * @author taotao.xu@hand-china.com
 */
public interface CustomersMapper extends Mapper<Customers> {
	//注意这个selectByCustomers方法被lov中的那个
    List<Customers> selectByCustomers(Customers customers);
    
    int insertCustomers(Customers customers);
    
    int updateCustomers(Customers customers);
    
    int deleteCustomers(Customers customers);

}
