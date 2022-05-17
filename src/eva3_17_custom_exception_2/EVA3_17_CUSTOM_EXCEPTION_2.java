/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_17_custom_exception_2;

/**
 *
 * @author invitado
 */
public class EVA3_17_CUSTOM_EXCEPTION_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Persona persona = new Persona("Juan Perez", -15);
        }catch (ExcepcionDeRango ex) {
            ex.printStackTrace();
        }
    }
    
}

class ExcepcionDeRango extends Exception {

    public ExcepcionDeRango() {
    }

    public ExcepcionDeRango(String string) {
        super(string);
    }
    
}

class Persona {
    String Nombre;
    int Edad;

    public Persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}