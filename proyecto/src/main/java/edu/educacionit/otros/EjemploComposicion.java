
package edu.educacionit.otros;

class Persona{
    public final String nombre;
    public final String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
class Alumno{
  public final String idAlumno;
  public final Persona persona; 

    public Alumno(String idAlumno, Persona persona) {
        this.idAlumno = idAlumno;
        this.persona = persona;
    }
}

public class EjemploComposicion implements Runnable {

    public void run() {
        Alumno a = new Alumno("1234", new Persona("Sergio","Hoz"));
        System.out.println(" ");
        System.out.print(a.idAlumno + " ");
        System.out.print(a.persona.nombre + " ");
        System.out.print(a.persona.apellido);
        System.out.println(" ");
    
    }
    
}
