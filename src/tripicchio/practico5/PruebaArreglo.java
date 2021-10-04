/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripicchio.practico5;

/**
 *
 * @author Gatito
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int[] arr1 = {10,20,30,40,50};  
        
        int [] arr1 = new int[5];
        
        for(int i=0;i<arr1.length;i++){
        arr1[i] = (int)(Math.random()*9);
        }
        Arreglo.sumarLista(arr1);    
        
        System.out.println("------------------------------------------------------");
        
                
        //int[][] arr2 = {{10,20,30,40},{130,40},{50,60},{70,80}};  
        
        int [][] arr2 = new int[5][5];
        
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]= (int)(Math.random()*9);            
            }
        }    
        
        Arreglo.buscarMayor(arr2);  
        
        System.out.println("------------------------------------------------------");
        
        String cadena = "El chino se comio un murcielago";
        Arreglo.cuentaVocales(cadena);
        
        System.out.println("------------------------------------------------------");
   
        String cadena2 = cadena;
        Arreglo.cuentaCaracter(cadena2, 'c');        
        
        
    }
    
}
