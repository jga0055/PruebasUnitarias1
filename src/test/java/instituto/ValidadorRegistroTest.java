package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();


    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");
        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ

    // Reto 1: Nombre vacío

    @Test
    @DisplayName("Reto 1: Nombre vacío debe ser rechazado")
    void deberiaRechazarNombreVacio() {
        String nombre = "";
        boolean resultado = validador.validarNombre(nombre);
        assertFalse(resultado, "El sistema debería devolver false para un nombre vacío");
    }


    // Reto 2: Password justa

    @Test
    @DisplayName("Reto 2: Password de 8 caracteres aceptada")
    void deberiaAceptarPasswordJusta() {
        String password = "12345678";
        boolean resultado = validador.validarPassword(password);
        assertTrue(resultado, "El sistema debería aceptar una contraseña de exactamente 8 caracteres");
    }

    // Reto 3: Password corta

    @Test
    @DisplayName("Reto 3: Password de 5 caracteres debe ser rechazada")
    void deberiaRechazarPasswordCorta() {
        String password = "Admin";
        boolean resultado = validador.validarPassword(password);
        assertFalse(resultado, "El sistema debería rechazar una contraseña demasiado corta");
    }

    // Reto 4: Email sin arroba

    @Test
    @DisplayName("Reto 4: Email sin arroba debe ser rechazado")
    void deberiaRechazarEmailSinArroba() {
        String email = "usuario.gmail.com";
        boolean resultado = validador.validarEmail(email);
        assertFalse(resultado, "El sistema debería rechazar un email sin '@'");
    }

    // Reto 5: Edad limite

    @Test
    @DisplayName("Reto 5: Edad mínima legal debe ser aceptada")
    void deberiaAceptarEdadMinimaLegal() {
        int edad = 16;
        boolean resultado = validador.validarEdad(edad);
        assertTrue(resultado, "El sistema debería aceptar a un usuario de exactamente 16 años");
    }
}
