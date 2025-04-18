/*
    Autor: Claudia Palacios
    Date: 02-2025
    Referencia: https://docs.oracle.com/javase/10/docs/api/java/net/URL.html
 */
import java.io.IOException;
import java.net.URL;

public class /*EjemploURL*/ejemploURL {//Modificamos el nombre ya que el nombre inicial del archivo ejemploURL con la e minuscula creando conflicto
    public static void main(String[] args) throws IOException {//Metodo principal encargado de la lectura y escritura por pantalla
        
        String test_url = "http://www.pol.una.py";//Ruta establecida para la prueba
        URL pagina1 = new URL(test_url);//objeto URL con la URL proporcionada
        URL pagina2 = new URL("http", "grado.pol.una.py", 80, "index.html");
        // objeto URL con varios componentes, especificando protocolo, host, puerto y archivo


        //Primera Prueba
        System.out.println("***** Primera pagina");
        System.out.println("Protocolo: "+pagina1.getProtocol());
        System.out.println("Puerto: "+pagina1.getPort());
        System.out.println("Host: "+pagina1.getHost());
        System.out.println("Archivo: "+pagina1.getFile());
        System.out.println("External form: "+pagina1.toExternalForm());
        System.out.println();

        //Segunda prueba
        System.out.println("***** Segunda pagina");
        System.out.println("Protocolo: "+pagina2.getProtocol());
        System.out.println("Puerto: " + (pagina2.getPort() != -1 ? pagina2.getPort() : pagina2.getDefaultPort()));
        System.out.println("Host: "+pagina2.getHost());
        System.out.println("Archivo: "+pagina2.getFile());
        System.out.println("External form: "+pagina2.toExternalForm());
        System.out.println();

    } //fin main

} //fin EjemploURL