package com.web_full.profilerestappi.repository;

import com.web_full.profilerestappi.model.User;
import com.web_full.profilerestappi.model.response.ResponseUser;
import com.web_full.profilerestappi.repository.provider.UserProvider;
import com.web_full.profilerestappi.util.Response;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRepository {
    @SelectProvider(type = UserProvider.class, method = "getALlUserSent")
    List<User> getAllUserSent();

    @Insert("insert into usersender(email, name, address, description) values(#{user.email}, #{user.name}," +
            " #{user.address}, #{user.description})")
    int responseUserSent(@Param("user") ResponseUser response);
}
