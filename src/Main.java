//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Dog dog1 = new Dog("ricks", "Chienpolice");
                Dog dog2 = new Dog("jack", "Pitbul");


                dog1.setName("ricks");
                dog1.setRace("Chienpolice");

                dog2.setName("jack");
                dog2.setRace("Pitbul");
                
                System.out.println("Name of Dog1 " + dog1.getName());
                System.out.println("Name of Dog2 " + dog2.getName());

                System.out.println("-------------------------------");

                System.out.println("Race of Dog1 " + dog1.getRace());
                System.out.println("Race of Dog2 " + dog2.getRace());


    }
}
