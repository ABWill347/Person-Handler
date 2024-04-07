package PersonHandler;

public class Main {
    public static void main(String[] args) {
        Person person0=new Person("Tom");
        Person person1=new Person("Joe");
        Person[] persons = {person0, person1};
        PersonHandler personHandler = new PersonHandler(persons);
        System.out.println("While loop "+personHandler.whileLoop());
        System.out.println("For loop "+personHandler.forLoop());
        System.out.println("For each loop "+personHandler.forEachLoop());

    }
}
