package com.example.client;

public class Main {
    public static void main(String[] args) {
        try {
            // Deshabilitar la verificación SSL
            DisableSSLVerification.disableSSLVerification();

            // Crear el servicio SOAP
            CalculatorService service = new CalculatorService();
            CalculatorServiceSoap soap = service.getCalculatorServiceSoap();

            // Llamar a los métodos del servicio
            int sumResult = soap.add(5, 10);
            int multiplyResult = soap.multiply(5, 10);

            // Imprimir los resultados
            System.out.println("Resultado de la suma: " + sumResult);
            System.out.println("Resultado de la multiplicación: " + multiplyResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
