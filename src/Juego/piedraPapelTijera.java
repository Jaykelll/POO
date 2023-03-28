//crear paquete
package Juego;
import java.util.*;
//crar clase
public class piedraPapelTijera implements Juego {
//crear atributos
    private int numero;
    private String pc;
    private String nombreplayer;
    private int eleccionPlayer;
//instanciar clases
    Scanner lectura=new Scanner(System.in);
    Random random=new Random();
    //crear metodo para iniciar el juego
    public void iniciar(){
        System.out.println("Hola, preparate para jugar piedra papel o tijera");
        System.out.println("Digita tu nombre");
        nombreplayer=lectura.next();
        System.out.println("Es un placer conocerte "+nombreplayer);
    }
//crear metodo para empezar a jugar
    public void jugar(){
        numero=random.nextInt(3)+1;
        switch(numero){
            case 1:
                pc="Piedra";
                break;
            case 2:
                pc="Papel";
                break;
            case 3:
                pc="Tijera";
                break;
        }
        System.out.println("Hola, elige el numero que desees \n piedra(1) \n papel(2) \n tijera(3)");
        eleccionPlayer=lectura.nextInt();
    }
//crear metodo del final del juego (si gano, perdio o empato)
    public void finalizar(){
        System.out.println("La pc eligio "+pc);
        if (eleccionPlayer==numero) {
            System.out.println("Empataste :o");
        }else if (eleccionPlayer==1&&numero==2||eleccionPlayer==2&&numero==3||eleccionPlayer==3&&numero==1) {
            System.out.println("Perdiste :(");
        }else if (eleccionPlayer==1&&numero==3||eleccionPlayer==2&&numero==1||eleccionPlayer==3&&numero==2) {
            System.out.println("Ganaste :)");
        }
    }
    
}
