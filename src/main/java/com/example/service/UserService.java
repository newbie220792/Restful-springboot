package com.example.service;

import com.example.DAO.UserDAO;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UserService {
@Autowired
private UserDAO userDAO;
    //list all user
    public ArrayList<User> listAllUser(){
        return this.userDAO.listAllUser();
    }

    //list user on id
    public User getUserById(int id){
        return this.userDAO.getUser(id);
    }
}
