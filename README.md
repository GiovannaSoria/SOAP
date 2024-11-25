# Taller SOAP - Servicio Web SOAP de Calculadora

Este proyecto implementa un servicio web SOAP utilizando .NET Framework en Visual Studio 2022 y demuestra cómo consumirlo desde diferentes lenguajes de programación como .NET, Java y Python. El servicio desarrollado es una calculadora con operaciones básicas como suma, resta, multiplicación y división.

## Objetivo
Implementar un servicio web SOAP y demostrar su interoperabilidad al consumirlo desde múltiples lenguajes de programación, proporcionando una guía práctica paso a paso.

## Requisitos
### Herramientas necesarias:
- **Visual Studio 2022** con la carga de trabajo ASP.NET y desarrollo web.
- **Java Development Kit (JDK)**, versión 11 o superior.
- **Python 3.6 o superior** con la librería Zeep instalada (`pip install zeep`).

### Tecnologías utilizadas:
- SOAP (Simple Object Access Protocol).
- .NET Framework.
- XML para la definición del protocolo.
- WSDL (Web Services Description Language).

---

## Desarrollo
### 1. Crear el Servicio SOAP
1. **Crear un proyecto en Visual Studio 2022**:
   - Seleccionar la plantilla `ASP.NET Web Application (.NET Framework)` y el tipo de proyecto `Web Forms`.
2. **Añadir un nuevo servicio web (ASMX)**:
   - Crear un archivo `CalculatorService.asmx` y definir métodos como `Add`, `Subtract`, `Multiply` y `Divide`.

### 2. Consumir el Servicio SOAP
#### A. Desde .NET
1. Agregar el servicio conectado a través de la URL del WSDL.
2. Generar las clases necesarias automáticamente en Visual Studio.
3. Crear un cliente para interactuar con el servicio en el archivo `Program.cs`.

#### B. Desde Java
1. Descargar el archivo WSDL desde la URL del servicio.
2. Utilizar la herramienta `wsimport` del JDK para generar las clases cliente:
   ```bash
   wsimport -keep -s src -p client CalculatorService.wsdl
   ```
3. Crear un proyecto en Visual Studio Code o IntelliJ y añadir un archivo `CalculatorClient.java` para invocar los métodos del servicio.

#### C. Desde Python
1. Instalar la librería `zeep` para consumir servicios SOAP:
   ```bash
   pip install zeep
   ```
2. Crear un archivo `calculator_client.py` para interactuar con el servicio, incluyendo el código para invocar las operaciones:
   ```python
   from zeep import Client

   wsdl = 'http://localhost:44319/CalculatorService.asmx?WSDL'
   client = Client(wsdl=wsdl)

   print("Suma:", client.service.Add(4, 2))
   print("División:", client.service.Divide(10, 2))
   ```
3. Ejecutar el cliente con:
   ```bash
   python calculator_client.py
   ```

---

## Conclusiones
- SOAP es un protocolo confiable que permite la interoperabilidad entre aplicaciones escritas en diferentes lenguajes de programación.
- Herramientas como `.NET Framework`, `wsimport` (Java) y `zeep` (Python) facilitan la creación y consumo de servicios web SOAP.
- SOAP sigue siendo relevante en escenarios donde se requiere estandarización, compatibilidad con sistemas legados y transacciones seguras.

---

## Referencias
- [Microsoft Learn](https://learn.microsoft.com/en-us/)
- [Oracle Help Center](https://docs.oracle.com/en/)

