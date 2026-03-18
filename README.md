📘 ValidadorRegistro - Tests con JUnit

Este proyecto contiene una serie de pruebas unitarias desarrolladas con JUnit 5 para validar el correcto funcionamiento de la clase ValidadorRegistro.

🎯 Objetivo

El objetivo es comprobar que los métodos de validación funcionan correctamente ante distintos casos, tanto válidos como inválidos.

Se prueban los siguientes elementos:

Nombres

Contraseñas

Emails

Edad

🧪 Tecnologías utilizadas

Java

JUnit 5

📂 Estructura del proyecto
src/
 ├── main/
 │    └── instituto/
 │         └── ValidadorRegistro.java
 │
 └── test/
      └── instituto/
           └── ValidadorRegistroTest.java
✅ Pruebas implementadas
✔️ Ejemplo inicial

Nombre válido → debe ser aceptado

🔹 Reto 1: Nombre vacío

Entrada: ""

Resultado esperado: ❌ Rechazado

🔹 Reto 2: Password justa

Entrada: "12345678" (8 caracteres)

Resultado esperado: ✅ Aceptada

🔹 Reto 3: Password corta

Entrada: "Admin" (5 caracteres)

Resultado esperado: ❌ Rechazada

🔹 Reto 4: Email sin arroba

Entrada: "usuario.gmail.com"

Resultado esperado: ❌ Rechazado

🔹 Reto 5: Edad mínima legal

Entrada: 16

Resultado esperado: ✅ Aceptada

▶️ Cómo ejecutar los tests

Clona el repositorio:

git clone https://github.com/tu-usuario/tu-repositorio.git

Abre el proyecto en tu IDE (IntelliJ, Eclipse, VS Code...)

Ejecuta la clase:

ValidadorRegistroTest
📌 Notas

Se utiliza assertTrue y assertFalse para validar los resultados.

Cada test incluye un @DisplayName para mejorar la legibilidad.

Las pruebas están pensadas para cubrir casos límite y errores comunes.

🚀 Autor

Proyecto realizado como práctica de testing en Java.
<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/42b84722-1f36-44ac-9a63-ab67cda7faae" />
