# 🚆 **Sistema de Cálculo de Pagos en Tren**

Este proyecto es una aplicación gráfica desarrollada en Java bajo el paradigma de **Programación Orientada a Objetos (POO)**.  
Permite calcular el costo total de un viaje en tren basándose en datos proporcionados por el usuario como distancia a recorrer y días de estancia. Además, aplica descuentos automáticos si se cumplen ciertas condiciones.

---

## ✨ **Características del Proyecto**

1. **Interfaz Gráfica Interactiva:**  
   - Campos para ingresar los datos del cliente y detalles del viaje.
   - Botón para calcular el pago total, considerando descuentos.
   - Resultados claros y fáciles de interpretar.

2. **Cálculo de Pago Basado en Condiciones:**  
   - Se aplica un **30% de descuento** si:
     - La distancia supera **3000 km**.
     - Los días de estancia son mayores a **2 días**.

3. **Diseño Modular Basado en POO:**  
   - **Separación de responsabilidades:** Cada funcionalidad clave está encapsulada en una clase.
   - Facilita la escalabilidad y el mantenimiento del código.

4. **Mensajes de Validación:**  
   - Asegura que el usuario ingrese datos válidos antes de realizar cálculos.

---

## 🛠️ **Tecnologías Utilizadas**

- **Lenguaje:** Java  
- **Librerías:**
  - `javax.swing` para la interfaz gráfica.
  - `java.awt` para el diseño y la disposición de los componentes.
  - `java.math` para cálculos precisos.

---

## 📋 **Requisitos del Sistema**

- **Java Development Kit (JDK):** Versión 8 o superior.  
- **Entorno de Ejecución:**  
  - IDE compatible con Java (IntelliJ IDEA, Eclipse, NetBeans, etc.) o consola de comandos.

---

## 🚀 **Cómo Ejecutar el Proyecto**

1. **Clona este repositorio:**
   ```bash
   git clone https://github.com/Caupolicanafulvicollis/java/tree/main/calculadoraFinanciera.git
   cd sistema-tren
   ```

2. **Compila el programa:**
   ```bash
   javac trenCalculadora/*.java
   ```

3. **Ejecuta el programa:**
   ```bash
   java trenCalculadora.TrenApp
   ```

---

## 🖥️ **Vista del Programa**

### **Formulario de Entrada**
- **Datos Requeridos:**
  - Nombre del cliente.
  - RUT del cliente.
  - Distancia a recorrer (en kilómetros).
  - Número de días de estancia en el tren.

- **Resultados Mostrados:**
  - Pago sin descuento.
  - Descuento aplicado (si corresponde).
  - Pago final después de aplicar descuentos.

### **Cálculo del Pago**

1. **Costo Base:**
   - El precio por kilómetro es **$0.75**.
   - Se calcula multiplicando la distancia ingresada por el precio base.

2. **Descuento Aplicado (si corresponde):**
   - Si se recorren más de **3000 km** y la estancia supera **2 días**, se aplica un **30% de descuento**.

3. **Cálculo Final:**
   - Pago sin descuento:

     - $$\text{Pago Base} = \text{Distancia} \times 0.75$$

   - Descuento:

     - $$\text{Descuento} = \text{Pago Base} \times 0.30$$

   - Pago final:

     - $$\text{Pago Final} = \text{Pago Base} - \text{Descuento}$$


---

## 📖 **Estructura del Proyecto**

El proyecto está organizado en las siguientes clases:

1. **`TrenApp`:**  
   Clase principal que inicia la aplicación y muestra la ventana principal.  

2. **`TrenFrame`:**  
   Clase para la ventana principal de ingreso de datos y cálculo de resultados.  

3. **`TrenCalculo`:**  
   Clase que encapsula la lógica de negocio para calcular el costo del viaje, descuentos y pago total.  

## 👥 **Contribuciones**

¿Te gustaría colaborar en este proyecto?  
- Reporta errores o problemas abriendo un issue en el repositorio.  
- Propón mejoras en la interfaz o lógica del programa.  
- Realiza un fork del repositorio y envía tus pull requests.

---

## 📝 **Licencia**

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

### **¡Gracias por revisar este proyecto! 🚂✨**

Si tienes preguntas o comentarios, no dudes en contactarme o abrir un issue en este repositorio. 😊