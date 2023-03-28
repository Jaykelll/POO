//crear paquete
package FIgura;
import java.util.Scanner;
//crear clase
public class triangulo extends FIgura{
    //crear los atributos
    private float areaTriangulo;
    private float base;
    private float altura;
    //crear metodo constructor
    public triangulo(float areaTriangulo, float base, float altura) {
        this.areaTriangulo=areaTriangulo;
        this.base=base;
        this.altura=altura;
    }
    //crear los metodos
    public void calcularArea() {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese a que equivale la base del triangulo");
        base=lectura.nextFloat();
        System.out.println("Ingrese a que equivale la base del triangulo");
        altura=lectura.nextFloat();
        areaTriangulo=(float)(base*altura)/2;
        System.out.println("El triangulo tiene una area de "+areaTriangulo);
        //limpiar buffer
        lectura.close();
    }
}
