package com.web_full.profilerestappi.service.serviceIMPL;

import com.web_full.profilerestappi.model.User;
import com.web_full.profilerestappi.model.response.ResponseUser;
import com.web_full.profilerestappi.repository.UserRepository;
import com.web_full.profilerestappi.service.UserService;
import com.web_full.profilerestappi.util.Response;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIMPL implements UserService {
    UserRepository userRepository;
    UserServiceIMPL(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public List<User> getAllUser() {
        return userRepository.getAllUserSent();
    }

    @Override
    public int ResponseUser(ResponseUser response) {
        return userRepository.responseUserSent(response);
    }
}
