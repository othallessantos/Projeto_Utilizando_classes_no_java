public class User {
    /*
    A simple system to know the name, the age and if he (specifically a man)
    live with his parents or not.
     */

    String nameOfUser;
    int ageOfUser;
    boolean heLiveWithHisParents;

    public User(String name, int age, boolean parents){
        nameOfUser = name;
        ageOfUser = age;
        heLiveWithHisParents = parents;
    }

}