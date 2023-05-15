package com.web_full.profilerestappi.repository;

import com.web_full.profilerestappi.model.User;
import com.web_full.profilerestappi.model.response.ResponseUser;
import com.web_full.profilerestappi.repository.provider.UserProvider;
import com.web_full.profilerestappi.util.Response;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRepository {
    @SelectProvider(type = UserProvider.class, method = "getALlUserSent")
    List<User> getAllUserSent();

    @InsertProvider(type = UserProvider.class, method = "insertUserSentSQL")
    int responseUserSent(@Param("user") ResponseUser response);
}
