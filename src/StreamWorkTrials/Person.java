package StreamWorkTrials;

public class Person {
    private final  String name;
    private final int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


@Override
    public String toString(){
        return "Name: " + name + ", Age: " + age + " StreamWorkTrials.Gender: " + gender;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}
