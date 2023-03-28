//crear paquete
package Juego;
import java.util.*;
//crear clase
public class caraYSello implements Juego {
    //crear atributos
    private int moneda;
    private String player;
    private int opcionplayer;
    //instanciar clases
    Scanner lectura=new Scanner(System.in);
    Random random=new Random();
    //solicitar los datos y crear el metodo para iniciar el juego
       public void iniciar() {
           System.out.println("Hola, jugador digita tu nombre");
           //capturar datos
           player=lectura.next();
       }
       //crear metodo para empezar el juego
       public void jugar() {
           System.out.println(player+"\n"+" Realice su elección \n cara(1) \n sello(2)");
           opcionplayer=lectura.nextInt();
           moneda=random.nextInt(2)+1;
           System.out.println("El resultado es...");
       }
       //crear metodo para saber el final (si gano o perdio)
       public void finalizar() {
           if(moneda==1||opcionplayer==1){
           System.out.println("Ha salido cara "+player+" ganaste");
           }else if(moneda==2||opcionplayer==2){
            System.out.println("Ha salido sello "+player+" ganaste");
           }else if(moneda==1||opcionplayer==2){
            System.out.println("Ha salido cara "+player+" perdiste");
           }else if(moneda==2||opcionplayer==1){
            System.out.println("Ha salido sello "+player+" perdiste");
           }
       }
}
