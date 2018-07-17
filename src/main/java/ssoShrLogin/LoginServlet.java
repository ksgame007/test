package ssoShrLogin;

import java.io.IOException;
import java.net.HttpRetryException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet implements Servlet
{

    @Override
    public void destroy()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ServletConfig getServletConfig()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getServletInfo()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void init( ServletConfig config )
        throws ServletException
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void service( ServletRequest req, ServletResponse resp)
        throws ServletException, IOException
    {
        try{
        String userName=req.getParameter( "username" );
        HttpServletRequest request=(HttpServletRequest) req;
        HttpServletResponse  response=(HttpServletResponse )resp;
        HttpSession session =  request.getSession();
        session.setAttribute("username", userName) ;
//        System.out.println(userName+"——成功登录:"+session.getAttribute( "username" ).toString());
        response.sendRedirect("index.jsp") ;
        
        }catch(Exception e){
            System.out.println("出现错误!");
        }
        
    }

   

}
