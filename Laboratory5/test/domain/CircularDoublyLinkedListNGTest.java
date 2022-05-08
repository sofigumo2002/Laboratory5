/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package domain;

import java.util.Date;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author wandagranados
 */
public class CircularDoublyLinkedListNGTest {

    public CircularDoublyLinkedListNGTest() {
    }

    @Test
    public void testSomeMethod() {

        //listas
        CircularDoublyLinkedList a = new CircularDoublyLinkedList();
        CircularDoublyLinkedList b = new CircularDoublyLinkedList();
        CircularDoublyLinkedList c = new CircularDoublyLinkedList();
        CircularDoublyLinkedList d = new CircularDoublyLinkedList();

        CircularLinkedList list = new CircularLinkedList();

        list.add(new Employee(0, "Jasson", "Fonseca", "Informatica", new Date(2001, 10, 23)));//20
        list.add(new Employee(1, "Hillary", "Solano", "Administracion", new Date(1998, 12, 02))); // 23
        list.add(new Employee(2, "Jose", "Piedra", "Ingles", new Date(1996, 11, 03)));//25
        list.add(new Employee(3, "Pablo", "Vargas", "Turismo", new Date(1993, 10, 19)));//28
        list.add(new Employee(4, "Joan", "Marin", "Agronomia", new Date(1991, 9, 7)));//30
        list.add(new Employee(5, "Jose Manuel", "Jimenez", "Diseño Publicitario", new Date(1987, 6, 22)));//34
        list.add(new Employee(6, "Ignacio", "Meneses", "Diseño Web", new Date(1984, 8, 30)));//37
        list.add(new Employee(2, "Jorge", "Mesa", "Asesor", new Date(1982, 7, 05)));//39
        list.add(new Employee(3, "Justin", "Aguilar", "Doctor", new Date(1980, 2, 19)));//42
        list.add(new Employee(4, "Danilo", "Mendez", "Abogado", new Date(1978, 4, 7)));//44
        list.add(new Employee(5, "Karina", "Piedra", "Diseño Publicitario", new Date(1974, 3, 15)));//48
        list.add(new Employee(6, "Ines", "Flores", "Diseño Web", new Date(1970, 4, 30)));//52
        list.add(new Employee(2, "Maria", "Rojas", "Ingles", new Date(1967, 4, 05)));//55
        list.add(new Employee(3, "Rosa", "Vega", "Turismo", new Date(1965, 2, 19)));//57
        list.add(new Employee(4, "Fiorella", "Sanabria", "Agronomia", new Date(1962, 4, 7)));//60
        list.add(new Employee(5, "Sofia", "Rodriguez", "Diseño Publicitario", new Date(1959, 3, 15)));//63
        list.add(new Employee(6, "Lucia", "Fernandez", "Diseño Web", new Date(1957, 4, 30)));//65

        System.out.println(list.toString());

        // lista "a" (empleados con rango de edad entre 18 y 25)
        
        System.out.println("Lista de empleados con rango de edad entre 18 y 25: ");
        System.out.println(fillRangeAge(list, 18, 25, a));
        System.out.println(a.toString());
        System.out.println(" ");
        
        // lista "b" (empleados con rango de edad entre 26 y 40)
        
        System.out.println("Lista de empleados con rango de edad entre 26 y 40: ");
        System.out.println(fillRangeAge(list, 26, 40, b));
        System.out.println(b.toString());
        System.out.println(" ");
        
        // lista "c" (empleados con rango de edad entre 41 y 55)
        
        System.out.println("Lista de empleados con rango de edad entre 41 y 55: ");
        System.out.println(fillRangeAge(list, 41, 55, c));
        System.out.println(c.toString());
        System.out.println(" ");
        
        // lista "d" (empleados con rango de edad mayor a 55)
        
        System.out.println("Lista de empleados con rango de edad mayor a 55: ");
        System.out.println(fillRangeAge(list, 55, 65, d));
        System.out.println(d.toString());
        System.out.println(" ");
        
       
        

    }

    public String fillRangeAge(CircularLinkedList list, int range, int range2, CircularDoublyLinkedList listDoubly) {

        String listAge = "";
        try {
            Employee employee;

            for (int i = 1; i <= list.size(); i++) {
                employee = (Employee) list.getNode(i).getData();

                if (employee.getAge(employee.getBirthday()) >= range && employee.getAge(employee.getBirthday()) <= range2) {
                    listDoubly.add(employee);
                }

            }
        } catch (ListException ex) {
            System.out.println("Error: " + ex);
        }
        return listAge;

    
    }
}

    


    

        
