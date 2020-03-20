package com.example.controller;



import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1")
public class UserRestController {
    @Autowired
    private UserService userService;

    @GetMapping("/user-list")
    public ResponseEntity<?> listAllUser() {
//        ArrayList<User> list = userService.listAllUser();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("status", "new");
//        return ResponseEntity.ok().headers(httpHeaders).body(list);
//        return new ResponseEntity<>(list, HttpStatus.OK);
        return  null;
    }

    @GetMapping("user/{id}")
    public ResponseEntity<?> getUser(@PathVariable int id){
        User user = userService.getUserById(id);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("status", "list-one-user");
        return ResponseEntity.ok().headers(httpHeaders).body(user);
    }



}