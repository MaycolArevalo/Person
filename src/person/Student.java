/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author borra
 */
public class Student extends Persona{
    String program;
    int year;
    double fee;
    
    public void program (String program, int year, double free){
    
        
        
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    private void ToString(){
        System.out.println("the name is: "+ name  +"The address is: "+address+ "the fee is: " + fee + "the year is: " + year );
        
    }
    
    
}
