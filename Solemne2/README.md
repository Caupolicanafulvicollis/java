### **README.md para el Programa "Solemne 2"**

---

# 🎉 **Solemne 2 - Programa Interactivo con Java**

¡Bienvenido al programa **Solemne 2**!  
Este proyecto es una aplicación gráfica desarrollada en **Java** con el paradigma de **Programación Orientada a Objetos (POO)**. Ofrece dos herramientas principales:  
1. **Cálculo del costo de un ticket de lotería.**  
2. **Cálculo de la energía cinética de un cuerpo en movimiento.**  

El programa incluye una interfaz gráfica intuitiva, diseñada para facilitar el uso y ofrecer resultados rápidos y precisos.

---

## ✨ **Características**

- **Ventana principal interactiva:**  
  - Botones para navegar entre las opciones: **Lotería**, **Energía** y **Salir**.
  
- **Cálculo del costo de lotería:**  
  - Determina el costo del ticket en función del monto del premio deseado.

- **Cálculo de energía cinética:**  
  - Basado en la fórmula:
    $E_c = \frac{1}{2} \cdot m \cdot v^2$

  - Donde:
    - $m$ : Masa del cuerpo (kg).
    - $v$ : Velocidad del cuerpo (m/s).

- **Validaciones de Entrada:**  
  - Asegura que los datos ingresados sean válidos antes de realizar los cálculos.

- **Diseño Modular:**  
  - Separación de responsabilidades en diferentes clases para facilitar el mantenimiento.

---

## 🛠️ **Tecnologías Utilizadas**

- **Lenguaje:** Java  
- **Librerías:**
  - `javax.swing`: Para la creación de la interfaz gráfica.
  - `java.awt`: Para la disposición y diseño de componentes.
  - `javax.swing.border`: Para manejar márgenes y bordes de los paneles.

---

## 📋 **Requisitos del Sistema**

- **Java Development Kit (JDK):** Versión 8 o superior.  
- **Entorno de Ejecución:**
  - Un IDE compatible con Java (IntelliJ IDEA, Eclipse, NetBeans) o consola de comandos.

---

## 🚀 **Cómo Ejecutar el Proyecto**

1. **Clona el Repositorio:**
   ```bash
   git clone https://github.com/Caupolicanafulvicollis/java/tree/main/Solemne2
   cd solemne2
   ```

2. **Compila el Proyecto:**
   ```bash
   javac Solemne2/*.java
   ```

3. **Ejecuta el Programa:**
   ```bash
   java Solemne2.Solemne2App
   ```

---

## 🖥️ **Vista del Programa**

### **Ventana Principal**
La ventana principal contiene un menú con tres opciones:  
- **Lotería:** Abre una ventana para calcular el costo del ticket.  
- **Energía:** Abre una ventana para calcular la energía cinética.  
- **Salir:** Permite cerrar la aplicación de forma segura.

### **Ventana de Lotería**
- **Datos de Entrada:**
  - Monto del premio deseado (desde y hasta).
- **Resultado:**
  - Costo del ticket calculado según las siguientes reglas:
    - Premio ≤ 1,000,000: Ticket = $1,000.
    - 1,000,000 < Premio ≤ 5,000,000: Ticket = $2,000.
    - 5,000,000 < Premio ≤ 10,000,000: Ticket = $3,000.

### **Ventana de Energía**
- **Datos de Entrada:**
  - Masa del cuerpo (kg).
  - Velocidad del cuerpo (m/s).
- **Resultado:**
  - Energía cinética calculada según la fórmula:
    $E_c = \frac{1}{2} \cdot m \cdot v^2$

---

## 📂 **Estructura del Proyecto**

El proyecto está dividido en cuatro clases principales:

1. **`Solemne2App`:**  
   Clase principal que inicializa la aplicación y la ventana principal.  
2. **`LoteriaFrame`:**  
   Clase encargada de la lógica y la interfaz para calcular el costo del ticket de lotería.  
3. **`EnergiaFrame`:**  
   Clase encargada de la lógica y la interfaz para calcular la energía cinética.  
4. **`UtilidadesGUI`:**  
   Clase auxiliar para métodos comunes en la interfaz gráfica.

---

## 🧮 **Fórmulas Utilizadas**

1. **Energía Cinética:**

   $$E_c = \frac{1}{2} \cdot m \cdot v^2$$

   Donde:
   - $E_c$: Energía cinética (J).
   - $m$: Masa del cuerpo (kg).
   - $v$: Velocidad del cuerpo (m/s).

2. **Costo del Ticket de Lotería:**
   Según el monto del premio:
   - $ \text{Premio} \leq 1,000,000 : Costo = 1,000.$
   - $ 1,000,000 < \text{Premio} \leq 5,000,000 : Costo = 2,000.$
   - $  5,000,000 < \text{Premio} \leq 10,000,000 : Costo = 3,000.$

---

## 👥 **Contribuciones**

¿Quieres colaborar?  
- Reporta problemas abriendo un issue.  
- Propón mejoras creando un pull request.  
- Comparte ideas para nuevas funcionalidades.

---

## 📝 **Licencia**

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

### 🎯 **Autor**
**Caupolicana Fulvicollis**  
Desarrollador en aprendizaje 🚀 | Explorando el mundo de Java y POO

¡Gracias por revisar este proyecto! Si tienes preguntas o comentarios, no dudes en contactarme. 😊