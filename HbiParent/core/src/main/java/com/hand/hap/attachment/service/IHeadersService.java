package com.hand.hap.attachment.service;


import java.util.List;

import com.hand.hap.attachment.dto.Headers;
import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;


/**
 * Created by hailor on 16/6/2.
 */
public interface IHeadersService extends IBaseService<Headers>, ProxySelf<IHeadersService> {

    List<Headers> selectByHeaders(IRequest requestContext, Headers headers, int page, int pagesize);
    
    List<Headers> batchUpdate(IRequest requestContext, @StdWho List<Headers> headers);
    
    
}
