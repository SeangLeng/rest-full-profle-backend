package com.web_full.profilerestappi.mapper;

import ch.qos.logback.core.model.ComponentModel;
import com.web_full.profilerestappi.model.User;
import com.web_full.profilerestappi.model.response.ResponseUser;
import com.web_full.profilerestappi.util.Response;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel =  "spring")
public interface UserMapper {
    List<ResponseUser> mapToUser(List<User> user);
}
