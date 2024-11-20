package com.example.To.Do.List;


import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class ServerController {

    @Autowired
    UserRepo users;

    @RequestMapping(path = "/add-item", method = RequestMethod.POST)
    public ResponseEntity<Item> addItemtoDB(HttpSession session, @RequestBody Item item) {
        Item newItem = new Item(item.id, item.creationDate, item.createdBy, item.title, item.description, item.dueDate,
                item.closeDate, item.closedBy);

        return new ResponseEntity<Item>(newItem, HttpStatus.OK);
    }

    @RequestMapping(path = "/allItems", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Item>> getAllItems(HttpSession session) {
        // get username that is stored in session id
        String userName = (String) session.getAttribute("userName");
        //User userFromDB = users.findbyUserName(userName);


        // Before DB persistance store user info in a hashmap to be a pseudo DB
        // Grab the user object stored in the hashmap with the username as the key
        User userFromDB = UserHashMapper.userHashMap.get(userName);

        //If this user object comes back as not null, i.e. must be registered it he hashmap DB
        if (userFromDB != null) {

            //create Hashmap of users and items
            //What is this actually creating?
            UserItems userItems = new UserItems();

            // I want to create a hashmap with all users as keys and arraylists per user

            // Then I need to pull the arraylist of items using the userFromDB as the key

            // Then I need to return a new response entity client side so that can be parsed and displayed accordingly.

            //create arraylist of user items
            ArrayList<Item> allUserItems = new ArrayList<Item>();

        }
        return null;
    }
}
