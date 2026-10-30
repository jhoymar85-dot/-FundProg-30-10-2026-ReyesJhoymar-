import java.util.Scanner;

public class ClasificadorUsuarios {

    // Clasifica la edad y valida el tipo de suscripcion.
    // Devuelve un mensaje de resultado que tambien puede probarse
    // de forma independiente desde una prueba unitaria.
    public static String clasificarUsuario(int edad, String suscripcion) {

        if (edad < 0) {
            return "Edad no valida.";
        }

        String categoria;

        // Primera estructura de decision: clasificacion por edad.
        if (edad <= 12) {
            categoria = "Nino";
        } else if (edad <= 17) {
            categoria = "Adolescente";
        } else if (edad <= 59) {
            categoria = "Adulto";
        } else {
            categoria = "Adulto mayor";
        }

        // Segunda estructura de decision: tipo de suscripcion.
        // Esta decision se ejecuta dentro del bloque de edad valido.
        if (suscripcion == null) {
            return "Tipo de suscripcion no valido.";
        }

        String tipo = suscripcion.trim().toLowerCase();

        if (tipo.equals("gratuita")) {
            return "Categoria: " + categoria + " | Acceso: Gratuito";
        } else if (tipo.equals("premium")) {
            return "Categoria: " + categoria + " | Acceso: Premium";
        } else {
            return "Tipo de suscripcion no valido.";
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CLASIFICADOR DE USUARIOS ===");
        System.out.print("Ingrese la edad: ");

        if (!entrada.hasNextInt()) {
            System.out.println("La edad debe ser un numero entero.");
            entrada.close();
            return;
        }

        int edad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese la suscripcion (gratuita/premium): ");
        String suscripcion = entrada.nextLine();

        System.out.println(clasificarUsuario(edad, suscripcion));

        entrada.close();
    }
}
