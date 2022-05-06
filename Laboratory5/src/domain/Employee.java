/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Estudiantes
 */
public class Employee {
    
    private int id;
    private String lastName;
    private String firstName;
    private String tittle;
    private Date birthday;

    public Employee(int id, String lastName, String firstName, String tittle, Date birthday) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.tittle = tittle;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    public int getAge(Date birthday) {
        Calendar calendar = Calendar.getInstance();
        if (equals(birthday, calendar)) {
            return calendar.get(Calendar.YEAR) - birthday.getYear() - 1;
        } else {
            return calendar.get(Calendar.YEAR) - birthday.getYear();
        }
    }

    private boolean equals(Date birthday, Calendar calendar) {
        return calendar.get(Calendar.YEAR) >= birthday.getYear() && calendar.get(Calendar.MONTH) <= birthday.getMonth() && calendar.get(Calendar.DATE) >= birthday.getDay();
    }

    @Override
    public String toString() {
        return "(ID)"+id +"/(Name)"+lastName+", "+firstName+ "/(Birthday)"+util.Utility.dateFormat(birthday)+ "/(Title)"+tittle+"/(Age)"+ getAge(birthday);
    }    
    
}
