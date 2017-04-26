/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.problema3;
import javax.swing.JOptionPane;
/**
 *
 * @author danii
 */
public class ProyectofinalProblema3 {

    /**
     * @param args the command line arguments
     * 
     * Johanna Daniela Macías Martínez A01411534
   Iván Constantino Hernández A01411529
   Maythe Portales Barrios A01411461
   Luisa Fernanda Sosa Brambila A01411485
     */
    public static void main(String[] args) {
        int opc=0;
        boolean flag=true;
         do{
             try{
                String menu=JOptionPane.showInputDialog("Ingrese la opción deseada: \n"
                    + "1. Calcular Máximo Común Divisor \n"
                    + "2. Calcular Mínimo Común Divisor \n"
                    + "3. Salir ");
            opc=Integer.parseInt(menu);
           }
           
           catch(Exception e){
               opc=3;
           }
   
        switch(opc){
           
        case 1:
        int a = solicitaentero("Escribe el primer número");
        int b = solicitaentero("Escribe el segundo número");
        int mayor = Math.max(a, b);
        int menor = Math.min(a, b);
        boolean band;
        
        do{
            int mod = mayor%menor; 
            if(mod==0){
                JOptionPane.showMessageDialog(null, "El M.C.D. entre "+a+" y "+b+" es: \n"+menor,"Total",1); 
                band=false;    
            }
            else {
                mayor = menor;
                menor = mod;
                band=true;
            }                   
        }while(band);
        break;  
 
        case 2:
        a = solicitaentero("Escribe el primer número");
        b = solicitaentero("Escribe el segundo número");
        menor = Math.min(a, b);
        int mcm = 0;
       
        for (int i=1; i<=menor; i++) {
            
            if (a%i==0 && b%i==0) {
              
                int mcd = i;
              
                mcm = (a*b)/mcd;
            }
        }
        JOptionPane.showMessageDialog(null, "El M.C.M. entre "+a+" y "+b+" es: \n"+mcm,"Total",1);
        flag=true;
        break;
        
        case 3:
            JOptionPane.showMessageDialog(null, "Adios!","Total",1);
            flag=false;
            break;
        }
         }
         while(flag);
    }

        
        public static int solicitaentero (String men){
        int num=0;
        boolean flag;
        do{
            try{
                String dato = JOptionPane.showInputDialog(men);
                num = Integer.parseInt(dato);
                flag=false;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "No tecleaste un númer entero","Error",0);
                flag=true;
            }
        }
        while(flag);
        return num;
    }
        
}