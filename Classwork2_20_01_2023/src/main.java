import model.Child;
import model.Hobbies;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Hobbies h1=new Hobbies("Cricket","sport");
        Hobbies h2=new Hobbies("swimming","outdoor");

        ArrayList<Hobbies> Hobby1=new ArrayList<Hobbies>();
        Hobby1.add(h1);
        Hobby1.add(h2);
        ArrayList<Hobbies> Hobby2=new ArrayList<Hobbies>();
        Hobby2.add(h2);
        Hobby2.add(h1);

        Child c1=new Child("Dhendup",Hobby1,16);
        Child c2=new Child("Dorje",Hobby2,19);


        c1.get_Fullname();
        c2.get_Fullname();

        h1.getClassStudent();

    }
}