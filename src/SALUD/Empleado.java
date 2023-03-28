//crear paquete
package SALUD;
//crear clase
public class Empleado extends PERSONA {
//crear atributos
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    private String departamento;
    private double valor;
    private double total;
        //crear super clase
        public Empleado(String cargo, double valorHora,double horasTrabajadas, String departamento){
        super();
        this.cargo=cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.departamento=departamento;
        }
        //crear metodo para calcular las horas
        public double calcularHonorarios(double valorhora, double horasTrabajadas){
        System.out.println("Calcular honorarios");
        total=valorHora*horasTrabajadas;
        valor=total*0.0966;
        valor=total-valor;
        return valor;
        }
        public void mostrarEmpleado(){
        System.out.println("Documento: "+getTipoDoc());
        System.out.println("Numero de documento: "+getDocumento());
        System.out.println("Nmbre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Peso: "+getPeso());
        System.out.println("Estatura: "+getEstatura());
        System.out.println("Edad: "+getEdad());
        System.out.println("Sexo: "+getSexo());
        System.out.println("Cargo: "+cargo);
        System.out.println("Valor hora: "+valorHora);
        System.out.println("Trabajo: "+horasTrabajadas+" horas extras");
        System.out.println("Departamento: "+departamento);
    }
  
}

