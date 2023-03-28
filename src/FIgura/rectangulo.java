//crear paquete
package FIgura;
import java.util.Scanner;
//crear clase
public class rectangulo extends FIgura{
        // crear atributos
        private float base;
        private float altura;
        private float areaRectangulo;
        //crear metodo constructor
        public rectangulo(float base,float altura) {
            this.base=base;
            this.altura=altura;
        }
        //crear metodo para calcular el area del rectangulo
        public void calcularArea(){
            Scanner lectura=new Scanner(System.in);
            System.out.println("Ingrese a que equivale la base del rectangulo");
            base=lectura.nextFloat();
            System.out.println("Ingrese a que equivale la altura del rectangulo");
            altura=lectura.nextFloat();
            areaRectangulo=base*altura;
            System.out.println("El rectangulo tiene una area de "+areaRectangulo);
            //limpiar buffer
            lectura.close();
        }
}
