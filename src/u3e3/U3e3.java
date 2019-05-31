/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u3e3;

/**
 *
 * @author fran
 */
public class U3e3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer cad2= new StringBuffer();
        StringBuilder cad3 = new StringBuilder();
        long inicio, fin;
        String cad1;
        cad1="";
        inicio=0;
        fin=0;
        
        
        /*******CLASE STRING*******/
        inicio = System.currentTimeMillis();
        for(int i=0; i<10000;i++){
            if(i%3==0){
                cad1+="Francisco Andrés ";
            }
            else{
                if(i%3==1){
                    cad1+="Oller ";
                 }
                else{
                    cad1+="López "; 
                }
            }//else
        }//for
        fin = System.currentTimeMillis();
        System.out.println("Tiempo de la clase String: "+(fin-inicio)+"ms");

        /*******CLASE STRINGBUFFER*******/        
        inicio = System.currentTimeMillis();
        for(int i=0; i<10000;i++){
            if(i%3==0){
                cad2.append("Francisco Andrés ");
            }
            else{
                if(i%3==1){
                    cad2.append("Oller ");
                 }
                else{
                    cad2.append("López "); 
                }
            }
        }//for
        fin = System.currentTimeMillis();        
        System.out.println("Tiempo de la clase StringBuffer: "+(fin-inicio)+"ms");

        
        /*******CLASE STRINGBUILDER*******/
        inicio = System.currentTimeMillis();
        for(int i=0; i<10000;i++){
            if(i%3==0){
                cad3.append("Francisco Andrés ");
            }
            else{
                if(i%3==1){
                    cad3.append("Oller ");
                 }
                else{
                    cad3.append("López "); 
                }
            }
        }//for
        fin = System.currentTimeMillis();        
        System.out.println("Tiempo de la clase StringBuilder: "+(fin-inicio)+"ms");
        
        
    }
    
}
