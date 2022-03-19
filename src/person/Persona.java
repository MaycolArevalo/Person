/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author borra
 */
public class Persona {
    String name;
    String address;

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    
    /*
    public void makeNoise() {
        System.out.println("Make noise as an... animal?");
    }
    
    */
    public void Person(String name, String address) {
        System.out.println("El nombre es: "+ this.name +"\n" + "y la direccion es: " + this.address ); 
    }
}
