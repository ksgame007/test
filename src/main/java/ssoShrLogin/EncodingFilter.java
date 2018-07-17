package ssoShrLogin;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EncodingFilter implements Filter
{
    private String encoding="UTF-8";

    @Override
    public void destroy()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void doFilter( ServletRequest req, ServletResponse resp, FilterChain chain )
        throws IOException, ServletException
    {
        
        HttpServletRequest request=(HttpServletRequest) req;
        HttpServletResponse  response=(HttpServletResponse )resp;
        request.setCharacterEncoding( encoding );
        response.setCharacterEncoding( encoding );
        
        chain.doFilter( request, response );
        
    }

    @Override
    public void init( FilterConfig conf )
        throws ServletException
    {
        encoding=conf.getInitParameter( "encoding" );
        System.out.println(encoding);
        
    }
    
}
