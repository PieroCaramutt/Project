/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdetails;

/**
 *
 * @author User
 */
public class Student {
    private String name;
    private int age;
    
    public Student(){}
    public Student(String _name, int _age){
        name = _name;
        age = _age;
    }
    
    public String toString(){
        return "The name of the student is "+getName()+" and the age is "+getAge();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}
