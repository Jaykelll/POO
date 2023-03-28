//crear paquete
package FIgura;
import java.util.Scanner;
//crear clase
public class circulo extends FIgura {
//crear atributos 
    private float radio;
    private double areaCirculo;
//crear metodo constructor
    public circulo(float radio) {
        this.radio=radio;
        } 
//crear metodo para calcular el area del circulo
    public void calcularArea(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio");
        radio=lectura.nextFloat();
            areaCirculo=Math.PI*Math.pow(radio,2);
            System.out.println("El circulo tiene un area de "+areaCirculo);
            //limpiar buffer
            lectura.close();
        }
    
}
