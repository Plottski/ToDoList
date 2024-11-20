package com.example.To.Do.List;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

@RestController
public class ToDoListController {

    @Autowired
    UserRepo users;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public ResponseEntity<User> userLogin(HttpSession session, @RequestBody User user) {
        User userFromDB = users.findbyUserName(user.getUserName());

    }


    //@PostConstruct
    //public void init() throws SQLException, IOException, ParseException {


   // }

}
