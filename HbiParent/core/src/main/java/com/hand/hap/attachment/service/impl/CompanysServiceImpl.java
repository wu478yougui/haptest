package com.hand.hap.attachment.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.attachment.dto.Companys;
import com.hand.hap.attachment.dto.Fruit;
import com.hand.hap.attachment.mapper.CompanysMapper;
import com.hand.hap.attachment.mapper.FruitMapper;
import com.hand.hap.attachment.service.ICompanysService;
import com.hand.hap.attachment.service.IFruitService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author taotao.xu@hand-china.com
 */
@Service
public class CompanysServiceImpl extends BaseServiceImpl<Companys> implements ICompanysService {

    @Autowired
    private CompanysMapper companysMapper;

	
	
	@Override
	//@Transactional这个注解表示此方法运用事务
	//SUPPORTS：支持当前事务，如果当前没有事务，就以非事务方式执行。 
	@Transactional(propagation = Propagation.SUPPORTS)
    public List<Companys> batchUpdate(IRequest requestContext, List<Companys> companys) {
        // TODO Auto-generated method stub
        for (Companys company : companys) {
            if (company.get__status() != null) {
                switch (company.get__status()) {
                case DTOStatus.ADD:
                	companysMapper.insertCompanys(company);
                    break;
                case DTOStatus.UPDATE:
                	companysMapper.updateCompanys(company);
                    break;
                case DTOStatus.DELETE:
                	companysMapper.deleteCompanys(company);
                    break;
                default:
                    break;
                }
            }
        }
        return companys;
    }



	@Override
	public List<Companys> selectByCompanys(IRequest requestContext, Companys companys, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return companysMapper.selectByCompanys(companys);
	}
}
