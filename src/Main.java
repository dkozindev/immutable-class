import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Passport.Human human1 = new Passport.Human("Johnny", "Silverhand", LocalDate.of(1988,11,16), "Male");
        Passport passportJohnny = new Passport(1234, 123213, human1, LocalDate.of(2001, 11, 23));

        //проверил через изменение human1
        human1.setName("Bob");
        System.out.println(human1);
        System.out.println();
        System.out.println(passportJohnny);
        System.out.println();

        //проверил через гетер вернуть поле human (Human) и изменить
        Passport.Human human2 = passportJohnny.getHuman();
        human2.setName("Erick");
        System.out.println(human2);
        System.out.println();
        System.out.println(passportJohnny);



    }
}