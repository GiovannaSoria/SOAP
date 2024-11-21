import warnings
from urllib3.exceptions import InsecureRequestWarning

# Suprimir las advertencias de SSL inseguro
warnings.simplefilter('ignore', InsecureRequestWarning)

from zeep import Client
from zeep.transports import Transport
from requests import Session

# Crear una sesión sin verificar el certificado SSL
session = Session()
session.verify = False  # Desactivar la verificación SSL

# Configurar el transporte con la sesión
transport = Transport(session=session)

# URL del WSDL de tu servicio SOAP
wsdl = 'https://localhost:44319/CalculatorService.asmx?wsdl'

# Crear el cliente usando el transporte
client = Client(wsdl=wsdl, transport=transport)

# Realizar las operaciones del servicio
print("Suma:", client.service.Add(4, 2))
print("Multiplicación:", client.service.Multiply(10, 3))
print("División:", client.service.Divide(20, 4))
print("Resta:", client.service.Subtract(14, 3))
