package com.web_full.profilerestappi.repository.provider;

import org.apache.ibatis.jdbc.SQL;

public class UserProvider {
    public String getALlUserSent(){
        return new SQL(){{
            SELECT("*");
            FROM("usersender");
        }}.toString();
    }
}
