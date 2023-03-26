/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author HP
 */
public class Student {

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the emial
     */
    public String getEmial() {
        return emial;
    }

    /**
     * @param emial the emial to set
     */
    public void setEmial(String emial) {
        this.emial = emial;
    }

    public Student() {
    }

    public Student( String firstname, String lastname, String emial) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.emial = emial;
    }
    
    private long id;
    private String firstname;
    private String lastname;
    private String emial; 
    
}
