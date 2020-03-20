package com.example.DTO;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class UserDTO {
    private int id;
    private  String name;

}
