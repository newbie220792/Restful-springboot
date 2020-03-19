package com.example.controller;

import com.example.DAO.UserDAO;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1")
public class UserRestController {
    @Autowired
    private UserDAO userDAO;

    @GetMapping("/")
    public ResponseEntity<?> listAllUser() {
        ArrayList<User> list = userDAO.listAllUser();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}