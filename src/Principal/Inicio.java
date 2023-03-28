//crear paquete 
package Principal;
import java.util.Scanner;
import SALUD.PERSONA;
import SALUD.Empleado;
import FIgura.*;
import Juego.caraYSello;
import Juego.piedraPapelTijera;
//crear clase
public class Inicio {
    //crear metodo
    public static void main(String[]agrs) {
    //crear atributos
    double peso=0;
    double estatura=0;
    String totalImc;
    double total;
    String cargo="";
    double valorHora=0;
    double horasTrabajadas=0;
    String departamento="";
    float lado=0;        
    float area=0;
    float base=0;
    float altura=0;
    float radio=0;
    int eleccion;
    //instanciar clase
    PERSONA persona=new PERSONA();
    Scanner lectura=new Scanner(System.in);
    Empleado empleado=new Empleado(cargo,valorHora,horasTrabajadas,departamento);
    circulo circulo=new circulo(radio);
    cuadrado cuadrado=new cuadrado(lado);
    rectangulo rectangulo=new rectangulo(base,altura);
    triangulo triangulo=new triangulo(area, base, altura);
    caraYSello caraYSello=new caraYSello();
    piedraPapelTijera pPt=new piedraPapelTijera();
    //RETO1 Y RETO2
    /*persona.pedirDatos();
    persona.mostrarPersona();
    //crear invocacion del metodo calcularImc
    System.out.println("Hola, persona vamos a ver tu peso");
    System.out.println("Digite su peso nuevamente");
        peso=lectura.nextDouble();
        System.out.println("Hola, persona vamos a ver tu estatura");
        System.out.println("Digite su estatura nuevamente");
        estatura=lectura.nextDouble();
        totalImc=persona.calcularImc(peso,estatura);
        System.out.println(totalImc);
    persona.mayorEdad();
//RETO3
System.out.println("Hola, soy un empleado voy a digitar mis datos: ");
System.out.println("Mi cargo es");   
        cargo=lectura.next();
        System.out.println("Mi valor de hora es: ");
        valorHora=lectura.nextDouble();
        System.out.println("Mis horas trabajadas son: ");
        horasTrabajadas = lectura.nextDouble();
        System.out.println("Mi departamento es: ");
        departamento=lectura.next(); 
        empleado.pedirDatos();
        empleado.mostrarEmpleado();
        total=empleado.calcularHonorarios(valorHora,horasTrabajadas);
        System.out.println("Mis honorarios son: "+total);*/
//RETO4
/*System.out.println("Hola, elige un numero para poder saber el area de esa figura");
        System.out.println("circulo(1)\n"+"cuadrado(2)\n"+"rectangulo(3)\n"+"triangulo(4)");
        eleccion=lectura.nextInt();
        //Utiliza un swicth para seleccionar el area que quiere hallar
        switch (eleccion) {
            case 1:
                circulo.calcularArea();
                break;
            case 2:
                cuadrado.calcularArea();
                break;
            case 3:
                rectangulo.calcularArea();
                break;
            case 4:
                triangulo.calcularArea();
                break;
        }*/
        //metodo de inicio, realización y finalización del juego carisellazo
        caraYSello.iniciar();
        caraYSello.jugar();
        caraYSello.finalizar();
        //metodo de inicio, realización y finalización del juego Piedra, papel y tijera
        pPt.iniciar();
        pPt.jugar();
        pPt.finalizar();
    //limpiar buffer
    lectura.close();
}
}
