/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud;

/**
 *
 * @author Marius
 */
public class Person {
    
    private int id;
    private String firstName;
    private String lastName;
 
    public Person() {
 
    }
 
    public Person(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}