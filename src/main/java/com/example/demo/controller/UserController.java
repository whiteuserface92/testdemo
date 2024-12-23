package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    public UserRepository userRepository;

    @PostMapping("/user/getUsers")
    public Iterable<User> getUsers() {

        System.out.println(userRepository.findAll());

    return userRepository.findAll();

    }

    @PostMapping("/user/getUser")
    public User getUserByUserId(@RequestBody String requestBody) throws ParseException {

        JSONParser parser = new JSONParser();

        JSONObject jsonpObject = (JSONObject)parser.parse(requestBody);

        return userRepository.findByUserId(jsonpObject.get("userId").toString());
    }

}
