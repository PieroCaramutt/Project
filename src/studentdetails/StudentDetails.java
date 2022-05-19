/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetails;

/**
 *
 * @author User
 */
public class StudentDetails {
    
    public static void main(String[] args){
        Student john = new Student("John", 19);
        Student daniel = new Student("Daniel", 20);
    
        Student[] std ={john, daniel};

        for(int i=0; i<2; i++){
            System.out.println(std[i]);
        }
    }
}
