
package Principal;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jimmy Coa
 */
public class Main {

    public static void main(String[] args) {
        
        
        Date nueva= new Date();
        System.out.println("Ingrese Marca de la Tarjeta:");
        Scanner scs= new Scanner(System.in);
        String marca=scs.nextLine();
        System.out.println("Ingrese Numero de tarjeta:");
        int num=scs.nextInt();
        System.out.println("Ingrese cardholder:");
        scs.nextLine();
        String cardh=scs.nextLine();
        TDC prueba=new TDC(num,marca,cardh);
        procesos pro=new procesos(num,marca,cardh);
        do {
        System.out.println("Introduzca la fecha de Vencimiento de la tarjeta con formato dd/mm/yyyy");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        prueba.setFecha(fecha);
        
        if(prueba.getFecha()==false){
        System.out.println("La fecha ingresada de Vencimiento debe ser mayor a la Fecha Actual:"+" "+nueva);
        System.out.println("");
          }
    }
        while(prueba.getFecha()==false);
        
        System.out.println("Menu:");
        System.out.println("Ingrese un Numero de Acuerdo a la opción(1,2,3)");
        System.out.println("[1] Tarjeta SQUA.");
        System.out.println("[2] Tarjeta SCO.");
        System.out.println("[3] Tarjeta PERE.");
        
        num=scs.nextInt();
        int monto;
        int mes;
        int dia;
        int total;
        switch (num){
            case 1:
                System.out.println("Ingrese Monto a Facturar, este debe ser menor a $1.000:");
                monto=scs.nextInt();
                System.out.println("Ingrese Mes en formato numero'1,2,3...':");
                mes=scs.nextInt();
                total=pro.Getsqua(monto, mes);
                pro.setTt(total);
                break;
            case 2:
                System.out.println("Ingresa Monto:");
                monto=scs.nextInt();
                System.out.println("Ingrese Dia en formato numero'1,2,3...hasta 31':");
                dia=scs.nextInt();
                total=pro.Getsco(dia, monto);
                pro.setTt(total);
                break;
            case 3:
                System.out.println("Ingrese Monto:");
                monto=scs.nextInt();
                System.out.println("Ingresa el Mes en formato numero'1,2,3...12':");
                mes=scs.nextInt();
                total=pro.Getpere(mes, monto);
                pro.setTt(total);
                break;   
        
        }
        
        System.out.println("La Operación Fue realizada con exito:");
        System.out.println("");
        System.out.println("Detalle de la compra:");
        System.out.println("Numero de la Tarjeta: "+prueba.getNum());
        System.out.println("Marca de la Tarjeta: "+prueba.getMarc());
        System.out.println("cardholder: "+prueba.getCardh());
        System.out.println("tarjeta Habilitada para Transacción (True/False): "+"("+prueba.getFecha()+")");
        System.out.println("Porcentaje usado en esta Operación: "+pro.getPorcentaje()+"%");
        System.out.println("Total a pagar: "+pro.getTt());
      }  
        
}
