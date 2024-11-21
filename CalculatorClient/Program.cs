using CalculatorClient.CalculatorServiceClient;
using System;
using CalculatorClient.CalculatorServiceClient; // Asegúrate de usar el espacio de nombres correcto.

namespace CalculatorClient
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                // Crear una instancia del cliente
                var client = new CalculatorServiceSoapClient();

                // Consumir los métodos del servicio
                Console.WriteLine("Suma: " + client.Add(8, 1));
                Console.WriteLine("Multiplicación: " + client.Multiply(5, 3));
                Console.WriteLine("Resta: " + client.Subtract(23, 3));
                Console.WriteLine("Division: " + client.Divide(40, 4));
            }
            catch (Exception ex)
            {
                Console.WriteLine($"Error: {ex.Message}");
            }
        }
    }
}
