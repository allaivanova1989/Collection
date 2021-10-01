import java.util.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex","man",25);
        User user2 = new  User("Ben", "man",31);
        User user3 = new  User("Anna", "woman",31);
        User user4 = new  User("Sofia", "woman",17);

        ArrayList<User> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(3, user4);
        Service service = new Service();

        System.out.println(service.searchebyName(usersList, "Micle"));
        System.out.println(service.returnCollectionByGender(usersList,"man"));


        TreeSet<User>usersSet = new TreeSet<>();
        usersSet.add(user1);
        usersSet.add(user2);
        usersSet.add(user3);
        usersSet.add(user4);
        System.out.println(usersSet);

    }
}
