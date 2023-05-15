package com.web_full.profilerestappi.repository.provider;

import org.apache.ibatis.jdbc.SQL;

public class UserProvider {
    public String getALlUserSent(){
        return new SQL(){{
            SELECT("*");
            FROM("usersender");
        }}.toString();
    }
    public String insertUserSentSQL(){
        return new SQL(){{
            INSERT_INTO("usersender");
            VALUES("email", "#{user.email}");
            VALUES("name", "#{user.name}");
            VALUES("address", "#{user.address}");
            VALUES("description", "#{user.description}");
        }}.toString();
    }
}
