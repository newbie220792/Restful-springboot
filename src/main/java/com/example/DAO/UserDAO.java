package com.example.DAO;

import com.example.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {

    public UserDAO(){}
    public ArrayList<User> listAllUser(){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1,"John"));
        list.add(new User(2,"John"));
        list.add(new User(3,"John"));
        list.add(new User(4,"John"));
        return list;
    }
}
