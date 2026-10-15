
import java.util.Scanner;

public class CalculadoraCombustible {
    
    public static void main(String[] args) {
    Scanner elpepe = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de Km del viaje: ");
    double distanciaKm = elpepe.nextDouble();
    System.out.println("Ingrese cantidad de Km recorridos por litro: ");
    double rendimientoKmPorLitro = elpepe.nextDouble();
    System.out.println("Ingrese valor de la gasolina por litro: ");
    double precioPorLitro = elpepe.nextDouble();
    System.out.println("Ingrese la cantidad de personas que viajan: ");
    int cantidadPersonas = elpepe.nextInt();
    double litrosNecesarios = distanciaKm / rendimientoKmPorLitro;
    double costoTotal = litrosNecesarios * precioPorLitro;
    double aportePorPersona = costoTotal / cantidadPersonas;
    System.out.println("Litros necesarios: " + litrosNecesarios);
    System.out.println("costoTotal: " + costoTotal);
    System.out.println("aportePorPersona: " + aportePorPersona);
    

    elpepe.close();
    }
}
