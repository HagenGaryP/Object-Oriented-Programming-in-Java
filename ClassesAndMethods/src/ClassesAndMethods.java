/*
Object-oriented programming languages have a construct called a "Class" that lets you
    structure your software in a particular way.  Allows you to add consistency to your
    programs so they can be used in a cleaner way.

A class is a way to take a grouping of methods (or functions) and data, and place them
    in a container so you can access them with the . (dot) operator.

Can create a class to represent a blueprint or definitions for the objects you want to work with.
    Similar to Python's use of "class Name(object):" where you create an instance of the class
    to carry out tasks for everything that is involved with ("is-a") that class.
For instance, we can create a class for human beings called "Person" (capitalized)
    that takes in and stores the variables or attributes we would expect a person to have.

Inheritance is used to indicate that one class will get most or all of its features from
    a parent class.  This happens implicitly whenever you write
        "class Foo(Bar)"    in Python
    which essentially says "make a class Foo that inherits from Bar."

 */
class Person {

    // Instance data (variables, data or "state")
    String name;
    int age;

    // Classes can contain: Data, Methods (Subroutines)

    // Instance Method, which has access to instance data/variables - to be called in main
    void speak(String text) { // method parameter "text" is like a variable for the method
        System.out.println(text);
    }

    // return a value in method, change from void to dataType
    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        return yearsLeft;
    }
    // "getter" methods
    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}


public class ClassesAndMethods {

    public static void main (String[] args) {

        // Create a Person object using the Person class

        Person person1 = new Person();
        person1.name = "Gary Hagen";
        person1.age = 31;

        // run method speak()
        person1.speak("Hello, " + person1.name); // passing variable to speak()

        // set variable equal to the value from calling calculateYearsToRetirement() method
        int years = person1.calculateYearsToRetirement();

        System.out.println("Years until retirement: " + years);

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);

    }
}
