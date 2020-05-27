package com.example.jackson.controller;

import com.example.jackson.domain.UserVO;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class JacksonController {

    @PostMapping("/user")
    @ResponseBody
    public Object convertPOJOandJSON(@RequestBody UserVO userVO){
        log.info("user id: " + userVO.getId() + ", user name:" + userVO.getName());
        return userVO;
    }
}
