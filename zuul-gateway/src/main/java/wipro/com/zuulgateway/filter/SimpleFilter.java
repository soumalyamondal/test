package wipro.com.zuulgateway.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import ch.qos.logback.classic.Logger;


public class SimpleFilter extends ZuulFilter {

	
			
		private static final Logger logger 
		  = (Logger)LoggerFactory.getLogger(SimpleFilter.class);			
	   
	   @Override
	   public String filterType() {
	       return "pre";
	   }
	   @Override
	   public int filterOrder() {
	       return 1;
	   }
	   @Override
	   public boolean shouldFilter() {
	       return true;
	   }
	   @Override
	   public Object run() {
	       RequestContext ctx = RequestContext.getCurrentContext();
	       HttpServletRequest request = ctx.getRequest();
	       System.out.println(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
	       logger.debug(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
	       return null;
	   }
	}