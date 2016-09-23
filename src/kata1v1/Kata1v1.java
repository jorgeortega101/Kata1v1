package kata1v1;

import java.util.Date;

public class Kata1v1 {

    public static void main(String[] args) {
        Person person = new Person("Jorge","Ortega", new Date(90,5,24));
        System.out.println(person.getName() + " " + person.getSurname()+" tiene "+ person.getAge() + " años.");
    }
    
}
