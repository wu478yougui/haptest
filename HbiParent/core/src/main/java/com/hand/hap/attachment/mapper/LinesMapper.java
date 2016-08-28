package com.hand.hap.attachment.mapper;

import java.util.List;

import com.hand.hap.attachment.dto.Lines;
import com.hand.hap.mybatis.common.Mapper;

public interface LinesMapper extends Mapper<Lines>{
	List<Lines> selectOrderLine(Lines line);
}