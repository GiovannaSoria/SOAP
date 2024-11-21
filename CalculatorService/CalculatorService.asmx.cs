using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace CalculatorService
{
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]

    public class CalculatorService : WebService
    {
        [WebMethod]
        public int Add(int a, int b)
        {
            System.IO.File.AppendAllText(@"E:\7mo Semestre\Aplicaciones Distribuidas\Parcial 1\SOAP\ServiceLog.txt", $"Servicio consumido: Add({a}, {b}) - {DateTime.Now}\n");
            return a + b;
        }


        [WebMethod]
        public int Subtract(int a, int b)
        {
            return a - b;
        }

        [WebMethod]
        public int Multiply(int a, int b)
        {
            return a * b;
        }

        [WebMethod]
        public double Divide(int a, int b)
        {
            if (b == 0) throw new DivideByZeroException("El divisor no puede ser cero.");
            return (double)a / b;
        }
    }
}