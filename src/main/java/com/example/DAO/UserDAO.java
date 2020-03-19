package com.example.DAO;

import com.example.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private ArrayList<User> list;

    public UserDAO() {
        this.createUser();
    }

    public ArrayList<User> listAllUser() {
        return list;
    }

    private void createUser() {
        this.list = new ArrayList<>();
        list.add(new User(1, "John"));
        list.add(new User(2, "John"));
        list.add(new User(3, "John"));
        list.add(new User(4, "John"));
    }

    public User getUser(int id){
        return list.get(id);
    }

    //update user
    public void updateUser (User user){
        list.set(user.getId(), user);
    }

    //delete user
    public void deleteUser(int id){
        list.remove(id);
    }
}
