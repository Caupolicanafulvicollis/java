## **Calculadora Completa en Java**

![Calculadora](https://github.com/Caupolicanafulvicollis/java/blob/main/Calculadora/Calculadora.png)  
*Imagen ilustrativa de la calculadora en funcionamiento.*

---

### 📖 **Descripción**

Esta es una calculadora gráfica desarrollada en Java utilizando **Swing** para la interfaz de usuario y diseñada con **Programación Orientada a Objetos (POO)**. La calculadora permite realizar operaciones básicas como suma, resta, multiplicación y división. Es una excelente herramienta para practicar conceptos de Java y diseño modular de aplicaciones.

---

### ✨ **Características**

- **Interfaz gráfica moderna:** Inspirada en las calculadoras estándar.
- **Operaciones soportadas:**
  - Suma (`+`)
  - Resta (`-`)
  - Multiplicación (`x`)
  - División (`÷`) con manejo de división por cero.
- **Memoria persistente:** El resultado de una operación puede ser reutilizado en cálculos posteriores.
- **Botón CE:** Permite reiniciar la calculadora limpiando la memoria y la pantalla.
- **Diseño modular:** Implementada utilizando principios de Programación Orientada a Objetos para mejorar la mantenibilidad y escalabilidad.

---

### 🚀 **Instrucciones de Uso**

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/tuusuario/calculadora-java.git
   cd calculadora-java
   ```

2. **Compilar el proyecto:**
   ```bash
   javac -d bin src/Calculadora/*.java
   ```

3. **Ejecutar la calculadora:**
   ```bash
   java -cp bin Calculadora.CalculadoraApp
   ```

4. **Uso básico:**
   - Haz clic en los botones numéricos para ingresar números.
   - Usa los operadores `+`, `-`, `x`, `÷` para realizar cálculos.
   - Presiona `=` para obtener el resultado.
   - Presiona `CE` para reiniciar la calculadora.

---

### 🛠 **Tecnologías Utilizadas**

- **Java SE 8+**
- **Swing**: Para la interfaz gráfica.
- **POO (Programación Orientada a Objetos)**: Para separar lógica, interfaz y ejecución.

---

### 📂 **Estructura del Proyecto**

```
calculadora-java/
│
├── src/
│   └── Calculadora/
│       ├── CalculadoraApp.java         # Clase principal
│       ├── CalculadoraGUI.java         # Lógica de la interfaz gráfica
│       └── CalculadoraLogica.java      # Operaciones matemáticas
│
├── bin/                               # Archivos compilados
│
└── README.md                          # Documentación del proyecto
```

---

### 👀 **Vista de la Calculadora**

#### **Interfaz Gráfica**
La calculadora tiene una interfaz gráfica con:
- Una **pantalla negra** para mostrar resultados y operaciones.
- Botones numéricos (`0-9`) y operadores (`+`, `-`, `x`, `÷`).
- Un botón `=` para calcular y `CE` para reiniciar.

---

### 🧪 **Casos de Prueba**

1. **Cálculo básico:**
   - Entrada: `2 + 3 =`
   - Salida esperada: `5`

2. **Uso de memoria:**
   - Entrada: `5 + 2 = + 3 =`
   - Salida esperada: `10`

3. **División por cero:**
   - Entrada: `8 ÷ 0 =`
   - Salida esperada: `Error: Div 0`

---

### 📝 **Cómo Contribuir**

¡Las contribuciones son bienvenidas! Si deseas colaborar:
1. Haz un fork del repositorio.
2. Crea una rama para tu funcionalidad:
   ```bash
   git checkout -b nueva-funcionalidad
   ```
3. Realiza tus cambios y haz un commit:
   ```bash
   git commit -m "Agregada nueva funcionalidad"
   ```
4. Envía un Pull Request.

---

### 🧑‍💻 **Autor**

Desarrollado por: *[Caupolicana fulvicollis](https://github.com/Caupolicanafulvicollis)*  
Si tienes preguntas o sugerencias, no dudes en contactarme. 🚀

---

### ⚖️ **Licencia**

Este proyecto está bajo la licencia **MIT**. Consulta el archivo `LICENSE` para más detalles.

---

### 🎯 **Próximas Mejoras**
- Soporte para números decimales.
- Funcionalidad para calcular porcentajes.
- Un historial de operaciones.
