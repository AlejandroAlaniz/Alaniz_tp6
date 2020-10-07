/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6_alaniz;

/**
 *
 * @author Alejandro
 */



public class Matriz {
    
    public void armar() {
     int matriz[][]=new int[4][];
         matriz[0]=new int[4];
         matriz[1]=new int[3];
         matriz[2]=new int[5];
         matriz[3]=new int[2];
         int contador=3;
         
         for(int i=0; i<matriz.length; i++) {
              System.out.println();
             for(int j=0; j<matriz[i].length; j++){
                 matriz[i][j] = contador;
                 
                 contador+=3;
                 
                 System.out.print(matriz[i][j]);
                 }
               }
         System.out.println();
         
         
         for(int i=0; i<matriz.length; i++) {
             
             for(int j=0; j<matriz[i].length; j++) {
                 if(matriz[i][j] % 2==0) {
                     System.out.println("Los numeros pares son: "+matriz[i][j]);
                 }
             }
         }
    }  
}
