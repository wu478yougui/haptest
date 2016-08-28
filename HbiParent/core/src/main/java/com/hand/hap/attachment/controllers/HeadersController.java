/*
 * #{copyright}#
 */

package com.hand.hap.attachment.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.attachment.dto.Companys;
import com.hand.hap.attachment.dto.Headers;
import com.hand.hap.attachment.dto.Lines;
import com.hand.hap.attachment.service.ICompanysService;
import com.hand.hap.attachment.service.IHeadersService;
import com.hand.hap.attachment.service.ILinesService;
import com.hand.hap.core.IRequest;
import com.hand.hap.core.exception.BaseException;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

/**
 * 水果控制器.
 * 
 * @author taotao.xu@hand-china.com
 */
@Controller
public class HeadersController extends BaseController {

    @Autowired
    private IHeadersService headersService;
    @Autowired
    private ILinesService iLinesService ;
    @Autowired
    private ICompanysService icompanysService;
    
    /**
     * 任务分配查询.
     * 
     * @param fruit
     *            分配对象
     * @param page
     *            起始页
     * @param pagesize
     *            分页大小
     * @param request
     *            HttpServletRequest
     * @return ResponseData
     */
    @RequestMapping(value = "/ass/headers/query")
    @ResponseBody
    public ResponseData getTasks(Headers headers, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(headersService.selectByHeaders(requestContext, headers, page, pagesize));
    }
    
    @RequestMapping(value = "/ass/headers/submit")
    //该注解用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为指定格式后，写入到Response对象的body数据区。
    //返回的数据不是html标签的页面，而是其他某种格式的数据时（如json、xml等）使用；
    @ResponseBody
    public void insertHeaders(HttpServletRequest request, @RequestBody List<Headers> headerslist)
    {    	
    	IRequest requestContext = createRequestContext(request);
    	
    	String ss = headerslist.get(0).getCompanyName();
    	System.out.println("++++++++++++++++++++++++++++++++++++++++++++"+ss);
    	Companys com = new Companys();
    	com.setCompanyName(ss);
    	long s = icompanysService.selectCompanyId(requestContext, com);
    	System.out.println("++++++++++++++++++++++++++++++++++++++++++++"+s);
    	
    	Headers headers =  headerslist.get(0);
    	headers.setCompanyId(s);
    	System.out.println(headers.toString());
    	headersService.batchUpdate(requestContext, headers);
    }
    
    
    
    
    @RequestMapping(value = "/ass/orderLines/queryByHeaderId")
    @ResponseBody
    public ResponseData getLines(Lines lines, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++"+lines.getHeaderId());
        List<Lines> line  = iLinesService.selectOrderLine(requestContext, lines, page, pagesize);
        System.out.println("--------------------------------------------"+line);
        return new ResponseData(line);
    }
}
