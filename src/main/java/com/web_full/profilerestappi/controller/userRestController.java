package com.web_full.profilerestappi.controller;

import com.web_full.profilerestappi.model.User;
import com.web_full.profilerestappi.model.response.ResponseUser;
import com.web_full.profilerestappi.service.UserService;
import com.web_full.profilerestappi.util.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/userSent")
public class userRestController {
    private final UserService userService;
    @GetMapping("/allUsers")
    public Response<?> getAllUserSent(){
        try {
            List<User> allSent = userService.getAllUser();
            return Response.<List<User>>ok().setMessage("Successful found!")
                    .setPayload(allSent)
                    .setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            return Response.<List<User>>notFound().setMessage("not found!");
        }
    }
    @PostMapping("/responseMessage")
    public Response<User> responseUser(@RequestBody ResponseUser request){
        try {
            int responseRow = userService.ResponseUser(request);
            if (responseRow > 0){
                User user = new User().setId(responseRow).setName(request.getName())
                        .setEmail(request.getEmail()).setDescription(request.getDescription())
                        .setAddress(request.getAddress());
                return Response.<User>createSuccess().setMessage("Successfully insert").setPayload(user);
            }else {
                return Response.<User>badRequest().setMessage("Bad Request ! Failed to create user");
            }
        }catch (Exception e){
            return Response.<User>exception().setMessage("Something Error!");
        }
    }
}