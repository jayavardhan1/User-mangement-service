package org.example.usermanagementservice.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserContoller {
//    GET /users/{id}: Fetches a user
    @GetMapping("")
    public UserDto getUser() {
        System.out.println("I RECEIVED A REQUEST");

        return new UserDto(1,"John","John@gmail.com","Admin");
    }

}
