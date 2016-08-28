package com.hand.hap.attachment.mapper;

import com.hand.hap.attachment.dto.Companys;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;


/**
 * @author taotao.xu@hand-china.com
 */
public interface CompanysMapper extends Mapper<Companys> {

    List<Companys> selectByCompanys(Companys companys);
    
    int insertCompanys(Companys companys);
    
    int updateCompanys(Companys companys);
    
    int deleteCompanys(Companys companys);
    
    int selectCompanyId(Companys companys);

}
