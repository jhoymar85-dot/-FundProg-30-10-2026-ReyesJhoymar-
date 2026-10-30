# ClasificadorUsuarios

**Asignatura:** Fundamentos de Programación  
**Estudiante:** Jhoymar Daniel Reyes Barrios  
**Programa:** Ingeniería Industrial  
**Institución:** Corporación Universitaria Americana

## Descripción
Aplicación de consola en Java que clasifica a una persona por grupo de edad y valida su tipo de suscripción (gratuita o premium), mediante estructuras condicionales `if-else`.

## Requisitos
- JDK 17 o superior (también puede funcionar con versiones anteriores compatibles).
- Eclipse, IntelliJ IDEA, NetBeans o terminal.
- No requiere librerías externas.

## Ejecución
Desde la carpeta `src`:

```bash
javac ClasificadorUsuarios.java ClasificadorUsuariosTest.java
java ClasificadorUsuarios
```

Para ejecutar las pruebas:

```bash
java ClasificadorUsuariosTest
```

La clase de pruebas ejecuta 12 verificaciones y muestra EXITOSO o FALLIDO.

## Archivos
- `src/ClasificadorUsuarios.java`: programa principal y método de clasificación.
- `src/ClasificadorUsuariosTest.java`: pruebas básicas automatizadas.
- `pruebas/CasosDePrueba.txt`: matriz de pruebas y resultados esperados.
- `documentacion/Informe.pdf`: informe académico.
- `documentacion/Pseudocodigo.txt`: diseño previo.
- `documentacion/DiagramaFlujo.mmd`: diagrama en Mermaid.

## Criterios de clasificación
- 0 a 12 años: Niño.
- 13 a 17 años: Adolescente.
- 18 a 59 años: Adulto.
- 60 años o más: Adulto mayor.
- Suscripciones válidas: gratuita y premium.


