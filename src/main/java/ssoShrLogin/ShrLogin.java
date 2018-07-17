package ssoShrLogin;

import javax.servlet.http.HttpServletRequest;

import com.kingdee.shr.sso.client.user.IUserNameBuilder;

public class ShrLogin implements IUserNameBuilder
{

    @Override
    public String getUserName( HttpServletRequest request )
    {
        System.out.println(request.getSession().getAttribute( "username" ).toString()+"_到这里获取过值!");
       
        return request.getSession().getAttribute( "username" ).toString();
//        return "0211001323";
    }

}
