/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.problema3;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author danii
 */
public class ProyectofinalProblema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc=0;
        boolean flag=true;
         do{
                opc = solicitaentero("Ingrese la opción deseada: \n"
                    + "1. Calcular Máximo Común Divisor \n"
                    + "2. Calcular Mínimo Común Divisor \n"
                    + "3. Salir ");
   
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
                JOptionPane.showMessageDialog(null, "El M.C.D. entre "+a+" y "+b+" es: \n"+menor); 
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
        a = solicitaentero("el primer número");
        b = solicitaentero("el segundo número");
        menor = Math.min(a, b);
        int mcm = 0;
       
        for (int i=1; i<=menor; i++) {
            
            if (a%i==0 && b%i==0) {
              
                int mcd = i;
              
                mcm = (a*b)/mcd;
            }
        }
        JOptionPane.showMessageDialog(null, "El M.C.M. entre "+a+" y "+b+" es: \n"+mcm);
        flag=true;
        break;
        
        case 3:
            JOptionPane.showMessageDialog(null, "Adios!");
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
                JOptionPane.showMessageDialog(null,"Error");
                flag=true;
            }
        }
        while(flag);
        return num;
    }
        
}