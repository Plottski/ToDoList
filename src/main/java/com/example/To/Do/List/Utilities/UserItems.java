package com.example.To.Do.List;

import java.util.ArrayList;
import java.util.HashMap;

public class UserItems {

    public ArrayList<HashMap<User, ArrayList<Item>>> allUserItemsArray;

    public HashMap<User, ArrayList<Item>> findUserHashMap(User user) {
        for (int i = 0; i < allUserItemsArray.size(); i++) {
            if (allUserItemsArray.get(Integer.parseInt(user.userName)) != null) {
                HashMap<User, ArrayList<Item>> userHashMap = allUserItemsArray.get(Integer.parseInt(user.userName));
                System.out.println("Success");
                return userHashMap;
            }
        }
        System.out.println("Failed");
        return null;
    }
}
