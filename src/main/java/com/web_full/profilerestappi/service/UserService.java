package com.web_full.profilerestappi.service;

import com.web_full.profilerestappi.model.User;
import com.web_full.profilerestappi.model.response.ResponseUser;
import com.web_full.profilerestappi.util.Response;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
    List<User> getAllUser();
    int ResponseUser(ResponseUser response);
}
