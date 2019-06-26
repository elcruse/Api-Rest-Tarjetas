
package Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.time.Instant;
import java.util.Date;


/**
 *
 * @author Jimmy coa
 */
    public class TDC {
    private String marc;
    private int num;
    private String cardh;
    private String fecha;
    protected boolean com;
    
    
    public TDC(int num,String marc,String cardh) {
        this.num=num;
        this.marc=marc;
        this.cardh=cardh;
        
    }

    public String getMarc() {
        return marc;
    }

    

    public int getNum() {
        return num;
    }

    

    public String getCardh() {
        return cardh;
    }

    

    public boolean getFecha() {
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        Date testDate=null;
        String date = fecha;
        try{
            
            testDate = df.parse(date);
            //System.out.println(df.format(new Date()));
            //System.out.println(testDate);
            Date fec= new Date();
            if(fec.after(testDate)){
                com=false;    
            }else{
            com=true;
            }
        } catch (ParseException e){ 
            
            System.out.println("Formato de fecha invalido");
            
        }
        return com;
    }

    public void setFecha(String fecha) {
       this.fecha=fecha;
         
    }
    
}
