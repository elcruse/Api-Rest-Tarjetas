
package Principal;

/**
 *
 * @author Jimmy Coa
 */
public class procesos extends TDC{
private int monto;
private int squa=365;
private int dia;
private int mes;
private double tasa;
private int total;
private float porcentaje;
private int tt;
    public procesos(int num, String marc, String cardh) {
        super(num, marc, cardh);
    }

    

    public int Getsqua(int monto, int mes){//Metodos para calcular la tasa depende el Banco 
       this.mes=mes; 
       this.monto=monto;
       if(this.monto<=1000){
         tasa=squa/30*100;
         porcentaje=(float)tasa/this.monto;
         total=this.monto+((int)porcentaje*100);
         System.out.println("Transacción: "+tasa+" total: $"+total+" Porcentaje: "+porcentaje+"%");
       }else{
       System.out.println("El monto debe ser Menor a $1000");
       }
       return total;
    }

    public double getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public float getPorcentaje() {
        return porcentaje;
    }
    
    
   
    public int Getsco(int dia,int monto){
     this.dia=dia;
     if (dia>31){   
     System.out.println("El dia debe menor a 31");
     }else{
     this.monto=monto;
     tasa=this.dia*0.5*100;   
     porcentaje=(float)tasa/monto;
     total=this.monto+((int)porcentaje*100);
     }
        return total;
    }
    
    public int Getpere(int mes, int monto){//aca se hace directo ya que el mes multiplicado por 0.1*100/monto no da la tasa
        this.mes=mes;
        this.monto=monto;
        porcentaje=(float)0.3*this.mes;
        total=this.monto+((int)porcentaje*100);   
        
    return total;
    }
    
}
