//crear paquete
package FIgura;
import java.util.Scanner;
//crear clase
public class cuadrado {
//crear atributos
    private float lado;
    private float areaCuadrado;
    //crear metodo constructor
    public cuadrado(float lado) {
        this.lado=lado;
    }
    //crear metodo para calcular el area del cuadrado
    public void calcularArea(){
    //instanciar clase
    Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese el valor de una de los lados");
        lado=lectura.nextFloat();
        areaCuadrado=(float)Math.pow(lado,2);
        System.out.println("El cuadrado tiene un area de "+areaCuadrado);
        //limpiar buffer
        lectura.close();
    }
}
