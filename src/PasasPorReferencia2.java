class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}

public class PasasPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.modificarNombre("Alonso");
        
        System.out.println("Iniciamos el método main");
        System.out.println("Persona.persona = "+ persona.getNombre());
        System.out.println("Antes de llamar el método test");


        Test(persona);

        System.out.println("Después de llamar el método test");
        System.out.println("Persona.persona = "+ persona.getNombre());
        System.out.println("Finaliza el método main con los datos del arreglo modificado");
    }

    public static void Test (Persona persona){
        
        System.out.println("Iniciamos el método test");

        persona.modificarNombre("Daniel");
        
        System.out.println("Finaliza el método test con los datos cambiados");
    }
}
