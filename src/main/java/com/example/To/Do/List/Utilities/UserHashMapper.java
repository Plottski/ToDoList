package com.example.To.Do.List;

import java.util.HashMap;

public class UserHashMapper {

    public static HashMap<String, User> userHashMap;

    public void storeUserDeets(String userName, User user) {
        userHashMap.put(userName, user);
    }

    public Object findUser(String userName) {
        return userHashMap.get(userName);
    }

}
