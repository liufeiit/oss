package me.oss.ti;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.insoul.copartner.service.IDemandService;
import com.insoul.copartner.service.IMediaService;
import com.insoul.copartner.service.IProjectService;
import com.insoul.copartner.service.ISystemSettingService;
import com.insoul.copartner.service.IUserFriendsService;
import com.insoul.copartner.service.IUserService;
import com.insoul.copartner.service.IUtilityService;
import com.insoul.copartner.service.IVerifyCodeService;

/**
 * @author 刘飞
 * 
 * @version 1.0.0
 * @since 2015年3月26日 下午4:07:31
 */
public class WebBase implements ServletContextAware {
	
	protected Log log = LogFactory.getLog(getClass());

    @Resource
    protected IUserService userService;
    
    @Resource
    protected ISystemSettingService systemSettingService;

    @Resource
    protected IUtilityService utilityService;
    
    @Resource
    protected IDemandService demandService;
    
    @Resource
    protected IMediaService mediaService;
    
    @Resource
    protected IProjectService projectService;

    @Resource
    protected IUserFriendsService userFriendsService;
    
    @Resource
    protected IVerifyCodeService verifyCodeService;

	@Autowired
	@Qualifier("multipartResolver")
	protected CommonsMultipartResolver multipartResolver;

	private ServletContext servletContext;

	public ServletContext getServletContext() {
		return servletContext;
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}
}