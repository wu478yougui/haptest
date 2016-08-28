package com.hand.hap.attachment.service;


import com.hand.hap.system.service.IBaseService;


import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;

import java.util.List;

import com.hand.hap.attachment.dto.Companys;
import com.hand.hap.attachment.dto.Fruit;
import com.hand.hap.core.IRequest;


/**
 * Created by hailor on 16/6/2.
 */
public interface ICompanysService extends IBaseService<Companys>, ProxySelf<ICompanysService> {

    List<Companys> selectByCompanys(IRequest requestContext, Companys companys, int page, int pagesize);
    
    List<Companys> batchUpdate(IRequest requestContext, @StdWho List<Companys> companys);
    
    int selectCompanyId(IRequest requestContext, Companys companys);
}
