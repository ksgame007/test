package com.kingdee.test;

import com.kingdee.shr.sso.client.user.IUserNameBuilder;

public class Test implements IUserNameBuilder {
    @Override
    public String getUserName(javax.servlet.http.HttpServletRequest httpServletRequest) {
        return   httpServletRequest.getSession().getAttribute( "username" ).toString() ;
    }
}
