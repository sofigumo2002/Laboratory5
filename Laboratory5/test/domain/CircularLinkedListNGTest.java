/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author sofia
 */
public class CircularLinkedListNGTest {

    public CircularLinkedListNGTest() {
    }

    @Test
    public void testSomeMethod() {
        CircularLinkedList list = new CircularLinkedList();//year,month,day

        list.add(new Employee(0, "Juan", "Perez", "Informatica", new Date(2002, 2, 20)));//20
        list.add(new Employee(1, "Pablo", "Mora", "Administracion", new Date(1999, 1, 25)));//23
        list.add(new Employee(2, "Daniel", "Cruz", "Ingles", new Date(1997, 2, 05)));//25
        list.add(new Employee(3, "Joshua", "Gutierrez", "Turismo", new Date(1994, 3, 19)));//28
        list.add(new Employee(4, "Lucia", "Vindas", "Agronomia", new Date(1992, 1, 15)));//30
        list.add(new Employee(5, "Jimena", "Mora", "Informatica", new Date(1988, 1, 14)));//34
        list.add(new Employee(6, "Ignacio", "Santos", "Diseño Publicitario", new Date(1985, 1, 16)));//37
        list.add(new Employee(7, "Fiorella", "Castro", "Diseño Web", new Date(1982, 5, 04)));//39
        list.add(new Employee(8, "Mauricio", "Black", "Asesor", new Date(1980, 1, 25)));//42
        list.add(new Employee(9, "Wanda", "Matamoros", "Doctor", new Date(1978, 3, 29)));//44
        list.add(new Employee(10, "Ismael", "Gomez", "Abogado", new Date(1973, 4, 19)));//48
        list.add(new Employee(11, "Clara", "Marin", "Doctor", new Date(1969, 5, 03)));//52
        list.add(new Employee(12, "Luis", "Espinoza", "Informatica", new Date(1964, 4, 23)));//57
        list.add(new Employee(13, "Antonio", "Sanchez", "Doctor", new Date(1962, 2, 04)));//60
        list.add(new Employee(14, "Alejandro", "Acuña", "Abogado", new Date(1959, 1, 26)));//63
        list.add(new Employee(15, "Aaron", "Mora", "Informatica", new Date(1956, 4, 14)));//65
        System.out.println(list.toString());
        System.out.println(" ");

        //Rango de edades
        System.out.println("Empleados con rango de edad entre 18 y 25: ");
        System.out.println(rangeAge(list, 18, 25));
        System.out.println(" ");
        System.out.println("Empleados con rango de edad entre 26 y 40: ");
        System.out.println(rangeAge(list, 26, 40));
        System.out.println(" ");
        System.out.println("Empleados con rango de edad entre 41 y 55: ");
        System.out.println(rangeAge(list, 41, 55));
        System.out.println(" ");
        System.out.println("Empleados con rango de edad mayor a 55: ");
        System.out.println(rangeAge(list, 55, 65));

        //Lista enlazada con los empleados que tienen la profesión indicada
        System.out.println(" ");
        System.out.println("Empleados con la misma profesión:");
        CircularLinkedList listTitle = getTitleList(list, "Informatica");
        System.out.println(listTitle.toString());
    }

    public String rangeAge(CircularLinkedList list, int range, int range2) {
        String listAge = "";
        try {

            for (int i = 1; i <= list.size(); i++) {
                Employee employee = (Employee) list.getNode(i).getData();

                if (employee.getAge(employee.getBirthday()) >= range && employee.getAge(employee.getBirthday()) <= range2) {
                    listAge += employee.toString() + "\n";
                }

            }
        } catch (ListException ex) {
            System.out.println("Error: " + ex);
        }
        return listAge;
    }


    public CircularLinkedList getTitleList(CircularLinkedList list, String title) {
        CircularLinkedList listTitle = new CircularLinkedList();
        try {

            for (int i = 1; i <= list.size(); i++) {
                Employee employee = (Employee) list.getNode(i).getData();

                if (employee.getTittle().equals(title)) {
                    listTitle.add(employee);
                }//

            }
        } catch (ListException ex) {
            System.out.println("Error: " + ex);
        }
        return listTitle;
    }

}//end main
