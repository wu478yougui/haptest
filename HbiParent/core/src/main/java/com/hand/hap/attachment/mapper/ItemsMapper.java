package com.hand.hap.attachment.mapper;

import com.hand.hap.attachment.dto.Items;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;


/**
 * @author taotao.xu@hand-china.com
 */
public interface ItemsMapper extends Mapper<Items> {

    List<Items> selectByItems(Items items);
    
    int insertItems(Items items);
    
    int updateItems(Items items);
    
    int deleteItems(Items items);

}
