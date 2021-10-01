import java.util.*;

public class Service {

    public boolean searchebyName(ArrayList<User> arrayList, String name) {
        for (Integer i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i).getName() == name) {
                return true;
            }
        }
        return false;
    }

    public ArrayList returnCollectionByGender(ArrayList<User> arrayList, String gender) {
        ArrayList<User> usersGender = new ArrayList<>();
        for (Integer i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i).getGender() == gender) {
                usersGender.add(arrayList.get(i));
            }
        }
        return usersGender;
    }

}


