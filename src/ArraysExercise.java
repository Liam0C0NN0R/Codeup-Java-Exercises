//TODO Array Basics: Create a class inside of src named ArraysExercises. Create a main method for this class to do your work.
// What happens when you run the following code? Why is Arrays.toString necessary? int[] numbers = {1, 2, 3, 4, 5};
// System.out.println(numbers);
import java.util.Arrays;
public class ArraysExercise {

public static void main(String[] args) {
//TODO Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person[] persons = new Person[3];
        persons[0] = new Person("Person 1");
        persons[1] = new Person("Person 2");
        persons[2] = new Person("Person 3");

        for (Person person : persons) {
        System.out.println(person.getName());
        }

        persons = addPerson(persons, new Person("Person 4"));

        System.out.println("After adding new person:");
        for (Person person : persons) {
        System.out.println(person.getName());
        }
        }
//TODO Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

public static Person[] addPerson(Person[] persons, Person personToAdd) {
        Person[] newPersons = Arrays.copyOf(persons, persons.length + 1);
        newPersons[persons.length] = personToAdd;
        return newPersons;
        }
}



