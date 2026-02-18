# prog-str-examen-u2-2c


Sección B — Práctica (70%)
Entrega: repositorio del grupo (en TU RAMA). No se permite el uso de arreglos en esta unidad, si no subes tu rama el examen no será calificado.

Problema práctico (2C) — Control de acceso a laboratorio
Construye un programa de consola en Java para registrar accesos al laboratorio.

Requerimientos (NO usar arreglos):
1) Solicita repetidamente:
   - ID del estudiante (String)
   - Hora de ingreso (int de 0 a 23)
     El ciclo termina cuando el ID sea "FIN".

2) Validaciones (deben ser del tipo visto en clase):
   - ID: no null, no vacío, longitud EXACTA de 8.
   - ID: debe ser alfanumérico (A-Z, a-z, 0-9). Si no lo es: mostrar "ID inválido" y usar continue.
   - Hora: debe ser entero. Si el usuario escribe algo que NO es entero, usa Scanner.hasNextInt() para detectarlo,
     muestra "Hora inválida" y termina el programa con return.
   - Hora: si es entero pero está fuera de 0..23, termina el programa con return.

3) Reglas de negocio:
   - Horario permitido: 7..19 (incluye ambos). Si está fuera, el acceso se DENIEGA.

4) Usa métodos static en la misma clase (mínimo):
   - static boolean esIdValido(String id)
   - static boolean esHorarioPermitido(int hora)

5) Al finalizar (cuando ID="FIN"), imprime:
   - totalRegistros, totalPermitidos, totalDenegados
   - porcentajePermitidos (con 2 decimales)

Nota sobre charAt (solo si lo ocupas para validar alfanumérico):
// Ejemplo mini:
// char c = id.charAt(0);  // obtiene el primer carácter del String
// Si c está entre '0' y '9' entonces es dígito.




#Proceso obligatorio de entrega:
- Clonar el repositorio del grupo (ejemplo): git clone <URL_DEL_REPO>
- Entrar al repositorio: cd <carpeta_del_repo>
- Crear tu rama con la nomenclatura: nombres-apellidoPaterno-gradoygrupo
- Ejemplo EXACTO: elieldavid-rodriguez-2c
- Crear y cambiarte a tu rama (ejemplo): git checkout -b elieldavid-rodriguez-2c
- Dentro de tu rama, trabaja con los archivos base proporcionados.
- Realizar commits con mensajes claros.
- Subir tu rama al remoto: git push -u origin <tu_rama>
- NO se acepta trabajo en main. Si haces push a main, automáticamente estás reprobado en U2.
- Si no subes tu rama, el examen no será calificado ni revisado, sin excepciones.

#Criterio de evaluación (70 puntos)
- Se revisará el código directamente (métodos, validaciones, control de flujo, resultados).
- 50 pts — Implementación de métodos solicitados (firmas correctas, static, retornos correctos).
- 20 pts — Validaciones y control de flujo (if/else, break, continue, return) usados correctamente.