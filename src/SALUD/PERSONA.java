//crear paquete
package SALUD;
import java.util.Scanner;
//crear clase
public class PERSONA{
//crear atributos
private String tipoDoc;
private int documento;
private String nombre;
private String apellido;
private double peso=0;
private double estatura=0;
private int edad;
private String sexo;
private double pesoActual;
//getters y setters (encapsulamiento)
public String getTipoDoc(){ //get
    return tipoDoc;
}
public void setTipoDoc(String tipoDoc){ //set
    this.tipoDoc=tipoDoc;
}
public int getDocumento(){ //get
    return documento;
}
public void setDocumento(int documento){ //set
    this.documento=documento;
}
public String getNombre(){ //get
    return nombre;
}
public void setNombre(String nombre) { //set
    this.nombre=nombre;
}
public String getApellido(){ //get
    return apellido;
}
public void setApellido(String apellido){ //set
    this.apellido=apellido;
}
public double getPeso(){ //get
    return peso;
}
public void setPeso(double peso){ //set
    this.peso=peso;
}
public double getEstatura(){ //get
    return estatura;
}
public void setEstatura(double estatura) { //set
    this.estatura=estatura;
}
public int getEdad(){ //get
    return edad;
}
public void setEdad(int edad){ //set
    this.edad=edad;
}
public String getSexo(){ //get
    return sexo;
}
public void setSexo(String sexo){ //set
    this.sexo=sexo;
}
public double getPesoActual(){ //get
    return pesoActual;
}
public void setPesoActual(double pesoActual){ //set
    this.pesoActual=pesoActual;
}
//crear metodo construntor con parametros
public PERSONA(String tipoDoc,int documento,String nombre,String apellido,double peso,double estatura,int edad,String sexo) {
    this.tipoDoc=tipoDoc;
    this.documento=documento;
    this.nombre=nombre;
    this.apellido=apellido;
    this.peso=peso;
    this.estatura=estatura;
    this.edad=edad;
    this.sexo=sexo;
}
//metodo constructor sin parametros
public PERSONA() {
}
//instanciar clase
Scanner lectura=new Scanner(System.in);
//crear metodo para pedir los datos
public void pedirDatos(){
    System.out.println("Hola, soy una persona y voy a diligenciar mis datos");
    System.out.println("Mi tipo de documento es: ");
    tipoDoc=lectura.next();
    System.out.println("Mi numero de documento es: ");
    documento=lectura.nextInt();
    System.out.println("Mi nombre es: ");
    nombre=lectura.next();
    System.out.println("Mi apellido es: ");
    apellido=lectura.next();
    System.out.println("Mi peso es: ");
    peso=lectura.nextDouble();
    System.out.println("Mi estatura es: ");
    estatura=lectura.nextDouble();
    System.out.println("Mi edad es:" );
    edad=lectura.nextInt();
    System.out.println("Mi sexo es: ");
    sexo=lectura.next();
}
//crear metodo para mostrar datos de persona 
public void mostrarPersona(){
    System.out.println("Mis datos son: ");
    System.out.println("Tipo de documento: "+tipoDoc);
    System.out.println("Numero de documento: "+documento);
    System.out.println("Nombre: "+nombre);
    System.out.println("Apellido: "+apellido);
    System.out.println("Peso: "+peso);
    System.out.println("Estatura: "+estatura);
    System.out.println("Edad: "+edad);
    System.out.println("Sexo: "+sexo);
}
//crear metodo para calcular el imc
public String calcularImc(double peso, double estatura){
    pesoActual=peso/(estatura*estatura);
    if (pesoActual<20) {
        return "PESO BAJO";
    }else if (pesoActual>20 || pesoActual<=25) {
        return "PESO IDEAL";
}else{
        return "PESO ALTO"; 
    }
}  
//crear metodo para calcular la edad
public void mayorEdad() {
    if(edad<18){
        System.out.println("usted es menor de edad");
    }else{
        System.out.println("usted es mayor de edad");
    }
}
}