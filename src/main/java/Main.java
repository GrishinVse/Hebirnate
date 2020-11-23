import models.User;
import services.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args){
        UserService userService = new UserService();
        User user = new User("Misha", 26);
        userService.saveUser(user);
        System.out.println("Save user = " + user);

        User user1 = new User("Vitya", 28);
        userService.saveUser(user1);
        System.out.println("Save user = " + user1);

        userService.saveUser(new User("Vasya", 28));
        List<User> userList = userService.findAllUsers();
        for (User userFor:userList) {
            System.out.println(userFor);
        }
    }
}
