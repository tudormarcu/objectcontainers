import java.util.*;

    public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Unemployed("Tudor",25));
        people.add(new Employee("Dragos", 17));
        people.add(new Student("Florin", 30));
        people.add(new Employee("Matei", 21));
        people.add(new Student("Cristian", 40));


        Iterator it = people.iterator();
        System.out.println("The persons from your list are: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("");

        Set<Person> peopleByName = new TreeSet<>(new NameComparator());
        peopleByName.addAll(people);

        Iterator it1 = peopleByName.iterator();
        System.out.println("The persons sorted by name are: ");
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        System.out.println("");

        Set<Person> peopleByAge = new TreeSet<>(new AgeComparator());
        peopleByAge.addAll(people);
        Iterator it2 = peopleByAge.iterator();

        
        System.out.println("The persons sorted by age are: ");
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        Address address1 = new Address("Romania", "Brasov", "Strada Republicii");
        Address address2 = new Address("Holland", "Roosendaal", "Krekelberg 47");
        Address address3 = new Address("Italy",   "Rome", "Via Margutta");

        List<Hobby> hobbyList = new ArrayList<>();
        Hobby hobby1 = new Hobby("Cooking", 7, address1, address2, address3);
        Hobby hobby2 = new Hobby("Gardening", 3, address2, address3);
        Hobby hobby3 = new Hobby("Dancing", 5, address1, address2);
        hobbyList.add(hobby1);
        hobbyList.add(hobby2);
        hobbyList.add(hobby3);

        Map<Person, List<Hobby>> hobbyOfPerson = new HashMap();
        Person pers = people.get(0);
        hobbyOfPerson.put(pers, hobbyList);

        System.out.println("");
        System.out.println("The hobbies of " + pers.getName() + " are: ");

        for (Object value : hobbyOfPerson.values()) {
            System.out.println(value);
        }
    }
}

