package ru.geekbrains.lesson3;

public class Program {

    public static void main(String[] args) {


        Employee employee2 = new Employee("DDDD", 32);

        Employee employee1 = new Employee("AAAAAA", 34);
        LinkedList<Employee> linkedList1 = new LinkedList<>();
        linkedList1.addFirst(new Employee("AAAAAA", 43));
        linkedList1.addFirst(new Employee("CCCC", 22));
        linkedList1.addFirst(employee1);
        linkedList1.addFirst(new Employee("EEEEE", 55));
        linkedList1.addFirst(new Employee("AAAAAA", 67));
        linkedList1.addFirst(new Employee("DDDD", 32));
        linkedList1.addFirst(new Employee("AAAAAA", 21));

        System.out.println(linkedList1);

        linkedList1.inverseList();
        System.out.println(linkedList1);



    }

}

