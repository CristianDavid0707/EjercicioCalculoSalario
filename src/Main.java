//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado="", documentoEmpleado="";
        double salarioBruto=0, salarioNeto=0,valorHora=0, cantidadHoras=0, deduccionSalud=0, deduccionPension=0,salarioMinimo =0;
        double valorHorasExtras=0, bonificacion=0, fondoSolidaridadPensional=0, valorRetencionFuente=0, auxilioTransporte =0;
        double horasExtras=0;
        System.out.print("Ingrese el Nombre del Empleado: ");
        nombreEmpleado= sc.nextLine();
        System.out.print("Ingrese el Documento del Empleado: ");
        documentoEmpleado= sc.nextLine();
        System.out.print("Ingrese el Valor de la Hora: ");
        valorHora = sc.nextDouble();
        System.out.print("Ingrese la cantidad Horas: ");
        cantidadHoras = sc.nextDouble();
        System.out.print("Ingrese el Valor del salario minimo actual: ");
        salarioMinimo = sc.nextDouble();

        if(cantidadHoras > 24){
            System.out.println("Se le puede pagar a el Empleado");
            salarioBruto = valorHora * cantidadHoras;

            deduccionPension = salarioBruto * 0.04;
            deduccionSalud = salarioBruto * 0.04;

            if (salarioBruto <= (salarioMinimo * 2 )){
                auxilioTransporte = 200000;
                bonificacion = salarioBruto * 0.1;
            }else {
                auxilioTransporte = 0;
                bonificacion = 0;
            }
            if (cantidadHoras > 96){
                horasExtras = cantidadHoras - 96;
                valorHorasExtras = (valorHora * 0.25) * horasExtras;
            }
            System.out.println("Detalle de pago" + nombreEmpleado);
            System.out.println("El salario Bruoto del Empleado " + nombreEmpleado + " es $ " + salarioBruto);
            System.out.println("La Deduccion por salud es de: " + deduccionSalud );
            System.out.println("La Deduccion por pension es de: " + deduccionPension );
            System.out.println("El auxilo de transporte es " + auxilioTransporte);
            System.out.println("La bonificacion es: " + bonificacion);
            System.out.println("El pago por horas extras es: " + valorHorasExtras);
            System.out.println("El salario neto es: " + (salarioBruto-deduccionPension-deduccionSalud+auxilioTransporte+bonificacion+valorHorasExtras));

        } else {
            System.out.print("Le Faltan " + (24 - cantidadHoras) + " horas de trabajo" );
        }



    }
}