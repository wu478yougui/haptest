package com.hand.hap.attachment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.attachment.dto.Lines;
import com.hand.hap.attachment.mapper.LinesMapper;
import com.hand.hap.attachment.service.ILinesService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

	@Service
	public class LinesServiceImpl extends BaseServiceImpl<Lines> implements ILinesService {
	    
	    @Autowired
	    private LinesMapper linesMapper;
		
		
		@Override
		public List<Lines> selectOrderLine(IRequest requestContext, Lines line, int page, int pagesize) {
			// TODO Auto-generated method stub
			PageHelper.startPage(page, pagesize);
			return linesMapper.selectOrderLine(line);
		}

	}

