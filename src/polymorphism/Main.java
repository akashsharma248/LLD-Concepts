package polymorphism;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public class Main {

    public  static  void changePasswordOfAllUsers(List<User> userList){

    }

    public static  void  main(String args[]){
        User user  = new TA();
//        user.expertise()
        User user1 = new Student();
        User user2 = new Mentor();

    }
}
