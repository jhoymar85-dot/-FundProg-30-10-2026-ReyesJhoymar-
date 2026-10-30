public class ClasificadorUsuariosTest {

    public static void main(String[] args) {
        verificar(1, 8, "gratuita",
                "Categoria: Nino | Acceso: Gratuito");
        verificar(2, 12, "premium",
                "Categoria: Nino | Acceso: Premium");
        verificar(3, 13, "gratuita",
                "Categoria: Adolescente | Acceso: Gratuito");
        verificar(4, 17, "premium",
                "Categoria: Adolescente | Acceso: Premium");
        verificar(5, 18, "gratuita",
                "Categoria: Adulto | Acceso: Gratuito");
        verificar(6, 30, "premium",
                "Categoria: Adulto | Acceso: Premium");
        verificar(7, 59, "gratuita",
                "Categoria: Adulto | Acceso: Gratuito");
        verificar(8, 60, "premium",
                "Categoria: Adulto mayor | Acceso: Premium");
        verificar(9, 75, "gratuita",
                "Categoria: Adulto mayor | Acceso: Gratuito");
        verificar(10, 100, "premium",
                "Categoria: Adulto mayor | Acceso: Premium");
        verificar(11, -5, "gratuita", "Edad no valida.");
        verificar(12, 25, "basica",
                "Tipo de suscripcion no valido.");

        System.out.println("Pruebas finalizadas.");
    }

    private static void verificar(int numero, int edad,
                                  String suscripcion, String esperado) {
        String obtenido =
                ClasificadorUsuarios.clasificarUsuario(edad, suscripcion);

        if (esperado.equals(obtenido)) {
            System.out.println("Caso " + numero + ": EXITOSO");
        } else {
            System.out.println("Caso " + numero + ": FALLIDO");
            System.out.println("  Esperado: " + esperado);
            System.out.println("  Obtenido: " + obtenido);
        }
    }
}
