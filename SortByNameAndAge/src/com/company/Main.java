package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countInouts = Integer.parseInt(scan.nextLine());

        List<Person> people = new ArrayList<>();

        for (int input = 0; input < countInouts; input++) {
            String[] personInfo = scan.nextLine().split(" ");
            String firstName = personInfo[0];
            String lastName = personInfo[1];
            int age = Integer.parseInt(personInfo[2]);
            people.add(new Person(firstName,lastName,age));

        }

        Collections.sort(people, Comparator.comparing(Person::getFirstName).thenComparingInt(Person::getAge));

        for (Person person : people) {
            System.out.print(person.toString());
        }

    }
}
