package StreamWorkTrials;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

// Output only females in the list
        System.out.println("\n***** Lists of Females *****");
        List<Person> females = people.stream()
                .filter( person -> person.getGender().equals(Gender.FEMALE))// &&  person.getAge()>20)
                .collect(Collectors.toList());
        females.forEach(System.out::println);

        System.out.println("\n***** Lists of Males *****");
//         Lists of MalesSe
        List<Person> males = people.stream()
                .filter( person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());
         males.forEach(System.out::println);


        System.out.println("\n***** Lists of People *****");
        people.forEach(System.out::println);


     







    }




    private static List<Person> getPeople() {
        return List.of(
                new Person("Patience Adwoa Ewusi", 20, Gender.FEMALE),
                new Person("James Bond", 20, Gender.MALE),
                new Person("Ebenezer Mensah", 29, Gender.MALE),
                new Person("James Bond", 23, Gender.MALE),
                new Person("Ama Kumah", 35, Gender.FEMALE)
        );
    }
}
