
package boletin17.pkg2;

public class Numeros {
    private int [] numeros=new int [6];
    
    public void cargarArray(){
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int) (Math.random()*50+1); 
        }
           
         
    }
    public void visualizar(){
        for(int i=numeros.length-1; i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
}
