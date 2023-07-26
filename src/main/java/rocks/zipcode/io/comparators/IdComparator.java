package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */

    public class IdComparator implements Comparator<Item> {

        @Override
        public int compare(Item o1, Item o2) {
            return o1.getId().compareTo(o2.getId());
        }
    }



    //The Comparator interface has a single method called compare(), which takes two objects of the same type and returns an integer value based on their comparison. The compare() method has the following signature:
   // int compare(T o1, T o2);
    /*If compare() returns a negative value: It means o1 is less than o2.
        If compare() returns zero: It means o1 is equal to o2.
        If compare() returns a positive value: It means o1 is greater than o2.*/

/*class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        // Sorting the list based on age using a custom Comparator
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });

        // Displaying the sorted list
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}

output
        Charlie - 20
        Alice - 25
        Bob - 30*/

