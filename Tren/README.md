### **README.md para el Proyecto "Cálculo de Pago en Tren"**

---

# 🚆 **Cálculo de Pago en Tren**

Este proyecto es una **aplicación gráfica en Java** que calcula el costo total de un viaje en tren, considerando la distancia a recorrer, los días de estancia y posibles descuentos. Desarrollado utilizando **Swing** para la interfaz gráfica, este programa es interactivo, intuitivo y visualmente atractivo.  

---

## ✨ **Características**

1. **Interfaz gráfica amigable:**  
   - Campos de entrada para los datos del cliente.
   - Botón de cálculo para mostrar los resultados.

2. **Cálculo automático del pago:**  
   - Calcula el costo total del viaje en función de:
     - Distancia a recorrer.
     - Días de estancia en el tren.

3. **Descuentos aplicados automáticamente:**  
   - Aplica un **30% de descuento** si:
     - El cliente recorre más de **3000 km**.
     - La estancia es mayor a **2 días**.

4. **Resultados claros y detallados:**  
   - Pago sin descuento.
   - Descuento aplicado.
   - Pago final después de aplicar descuentos.

5. **Mensajes de validación:**  
   - Asegura que el usuario ingrese todos los datos correctamente antes de realizar el cálculo.

---

## 🛠️ **Tecnologías Utilizadas**

- **Lenguaje:** Java  
- **Librerías:**  
  - `javax.swing` para la interfaz gráfica.  
  - `java.awt` para el diseño y los eventos.  

---

## 📋 **Requisitos del Sistema**

- **Java Development Kit (JDK):** Versión 8 o superior.  
- **Entorno de Ejecución:** Compatible con cualquier IDE como IntelliJ IDEA, Eclipse o NetBeans.  

---

## 🚀 **Cómo Ejecutar el Proyecto**

1. **Clona este repositorio:**
   ```bash
   git clone https://github.com/Caupolicanafulvicollis/java/blob/main/Tren.git
   cd calculo-pago-tren
   ```

2. **Compila el programa:**
   ```bash
   javac Tren.java
   ```

3. **Ejecuta el programa:**
   ```bash
   java Tren
   ```

4. **Interactúa con la aplicación:**
   - Ingresa los datos solicitados y presiona **"Calcular pago"** para obtener los resultados.

---

## 🖥️ **Vista de la Aplicación**

### **Formulario de Entrada:**

- Campos:
  - Nombre del cliente.
  - RUT del cliente.
  - Distancia a recorrer (en km).
  - Días de estancia en el tren.

- Botón:
  - **"Calcular pago"** para procesar los datos.

---

### **Resultados Mostrados:**

- **Pago sin descuento:**  
  Muestra el costo total sin aplicar descuentos.  

- **Descuento aplicado:**  
  Calcula y muestra el monto de descuento aplicado (si corresponde).  

- **Pago final:**  
  Indica el monto total que debe pagar el cliente después del descuento.  

---

## 📊 **Lógica del Cálculo**

1. **Costo Base:**  
   - El precio por kilómetro es **$0.75**.

2. **Condiciones de Descuento:**  
   - Se aplica un descuento del **30%** si:
     - La distancia es mayor a **3000 km**.
     - El número de días de estancia supera **2 días**.

3. **Cálculo Final:**  
   - **Pago sin descuento:**  
     - <img src="https://latex.codecogs.com/gif.latex?\text{Pago Base} = \text{Distancia} \times 0.75" /> 

   - **Descuento:**  
        - <img src="https://latex.codecogs.com/gif.latex?O_t=\text{Descuento} = \text{Pago Base} \times 0.30" /> 

   - **Pago Final:**  
        - <img src="https://latex.codecogs.com/gif.latex?O_t=\text{Pago Final} = \text{Pago Base} - \text{Descuento}" /> 

---

## 📖 **Estructura del Código**

### **Clase Principal: `Tren`**

- **Propiedades:**  
  - `JLabel`, `JTextField`, y `JButton` para la interfaz gráfica.  
  - Variables para capturar los datos del cliente y realizar los cálculos.  

- **Método Principal:**
  - Inicia la ventana principal de la aplicación.  

- **Botón "Calcular Pago":**
  - Valida los datos ingresados.  
  - Calcula el pago total considerando descuentos.  
  - Muestra los resultados en etiquetas.

---

## 🛡️ **Validaciones Incluidas**

1. **Campos Vacíos:**  
   - Si algún campo está vacío, se muestra un mensaje de error:  
     _"Debe ingresar todos los datos solicitados."_  

2. **Formato de Entrada:**  
   - Solo se permiten valores numéricos en los campos de distancia y días de estancia.  
   - Si los valores no son válidos, se muestra un mensaje:  
     _"Debe ingresar valores numéricos válidos."_  

---

## 👥 **Contribuciones**

¿Tienes ideas para mejorar este proyecto? ¡Estoy abierto a sugerencias! Puedes colaborar con mejoras en la interfaz, nuevas funcionalidades o reportar problemas.  

---

## 📝 **Licencia**

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

### **¡Gracias por revisar este proyecto! 🚂✨**

Si tienes preguntas o comentarios, no dudes en contactarme o abrir un issue en el repositorio. 😊