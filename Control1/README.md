### **README.md para el Proyecto "Calculadora Financiera con Menú Gráfico"**

---

# 💼 **Calculadora Financiera con Menú Gráfico**

Este proyecto es una aplicación gráfica en Java que permite realizar dos cálculos financieros clave:  
1. **Cálculo de impuestos para artículos.**  
2. **Cálculo de intereses para depósitos.**

El programa utiliza un menú interactivo para seleccionar las opciones disponibles y proporciona resultados claros en ventanas separadas.

---

## ✨ **Características**

1. **Menú Principal Intuitivo:**  
   - Opciones disponibles:
     - **Factura:** Cálculo del impuesto y total de un artículo.
     - **Interés:** Cálculo del interés ganado sobre un capital.
     - **Salir:** Cierra el programa.
   - Implementado mediante un `JMenuBar`.

2. **Ventanas Interactivas:**  
   - Cada cálculo tiene una ventana dedicada que guía al usuario con campos de entrada y resultados.

3. **Mensajes de Validación:**  
   - Si el usuario ingresa datos incorrectos, el programa muestra alertas claras.

4. **Fácil de Usar:**  
   - Interfaz gráfica simple y funcional para usuarios sin experiencia técnica.

---

## 🛠️ **Tecnologías Utilizadas**

- **Lenguaje:** Java  
- **Librerías:**  
  - `javax.swing` para la creación de la interfaz gráfica.  
  - `java.awt` para el diseño y posicionamiento de los componentes.

---

## 📋 **Requisitos del Sistema**

- **Java Development Kit (JDK):** Versión 8 o superior.  
- **Entorno de Ejecución:**  
  - Cualquier IDE que soporte Java (Eclipse, IntelliJ, NetBeans) o consola de comandos.

---

## 🚀 **Cómo Ejecutar el Proyecto**

1. **Clona este repositorio:**
   ```bash
   git clone https://github.com/tu-usuario/calculadora-financiera.git
   cd calculadora-financiera
   ```

2. **Compila el programa:**
   ```bash
   javac CalculadoraFinanciera.java
   ```

3. **Ejecuta el programa:**
   ```bash
   java CalculadoraFinanciera
   ```

4. **Interactúa con el programa:**
   - Selecciona una opción en el menú para abrir las ventanas correspondientes.

---

## 🖥️ **Vista del Programa**

### **Menú Principal:**
Cuando ejecutas el programa, se muestra una ventana con un menú desplegable que permite elegir entre las opciones:
- **Factura:** Calcula impuestos para artículos.
- **Interés:** Calcula intereses para depósitos.
- **Salir:** Cierra la aplicación.

### **Cálculo de Factura:**
- Ventana donde el usuario ingresa:
  - Nombre del artículo.
  - Precio del artículo.
- **Resultados:**
  - Monto a pagar por impuesto (19%).
  - Total a pagar (precio + impuesto).

### **Cálculo de Interés:**
- Ventana donde el usuario ingresa:
  - Nombre y RUT del depositante.
  - Capital depositado.
  - Porcentaje de interés.
- **Resultados:**
  - Monto del interés ganado.
  - Capital final (capital + interés).

---

## 📊 **Cálculos Realizados**

### **Cálculo de Impuestos (Factura):**
- Fórmula del impuesto:
  \[
  \text{Impuesto} = \text{Precio del artículo} \times 0.19
  \]
- Fórmula del total:
  \[
  \text{Total} = \text{Precio del artículo} + \text{Impuesto}
  \]

### **Cálculo de Interés (Depósitos):**
- Fórmula del interés:
  \[
  \text{Interés Ganado} = \text{Capital} \times \left(\frac{\text{Porcentaje de Interés}}{100}\right)
  \]
- Fórmula del capital final:
  \[
  \text{Capital Final} = \text{Capital} + \text{Interés Ganado}
  \]

---

## 🛡️ **Validaciones Incluidas**

1. **Campos Vacíos:**  
   - Si un campo de entrada está vacío, aparece un mensaje:
     ```
     Ingrese valores válidos.
     ```

2. **Formato Numérico:**  
   - Los campos de precio, capital e interés deben ser valores numéricos.  
   - Si el usuario ingresa texto en lugar de números, el programa muestra un mensaje de error.

---

## 📖 **Estructura del Código**

### **Archivo Principal: `CalculadoraFinanciera.java`**
Este archivo contiene toda la lógica de la aplicación:
1. **Menú Principal:**
   - Creado con `JMenuBar`, contiene las opciones de "Factura", "Interés" y "Salir".
2. **Ventana de Factura:**
   - Componentes:
     - `JLabel` y `JTextField` para los datos del artículo.
     - Botón "Calcular" con acción para mostrar los resultados.
   - Resultados mostrados en etiquetas dinámicas.
3. **Ventana de Interés:**
   - Componentes:
     - `JLabel` y `JTextField` para los datos del depósito.
     - Botón "Calcular" para procesar los resultados.
   - Resultados claros para interés y capital final.

---

## 👥 **Contribuciones**

Si deseas colaborar, puedes enviar mejoras o nuevas funcionalidades. Algunas ideas:  
- Agregar más opciones al menú (por ejemplo, cálculos adicionales).  
- Mejorar el diseño gráfico.  
- Implementar validaciones más avanzadas.  

---

## 📝 **Licencia**

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

### **¡Gracias por explorar este proyecto! 🚀**

¿Tienes alguna pregunta o sugerencia? No dudes en abrir un issue en este repositorio. 😊