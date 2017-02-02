
package boletin17.pkg2;

public class DAM {
    int [] notas = {6, 4, 8, 7, 3, 4, 9, 3, 10, 8, 4, 9, 5, 7, 6, 8, 10, 9, 7, 5, 10, 8, 6, 9, 5, 7, 5, 7, 8, 9};
    int aprobados = 0;
    int suspensos = 0;
    
    public void calcularAprobados(){
        for(int i=0; i<notas.length; i++)
            
            if (notas[i]>=5){
                aprobados++;
            }
        System.out.println("Aprobados: " +aprobados);
    }
    
    public void calcularSuspensos(){
        for(int i=0; i<notas.length; i++)
            
            if (notas[i]<5){
                suspensos++;
            }
        System.out.println("Suspensos: " +suspensos);
    }
    
    public void notaMedia(){
        int media = 0;
        for(int i=0; i<notas.length; i++)
            media = media+notas[i];
        
        System.out.println("Media:" +media/notas.length);
    }        
    
    public void notaMasAlta(){
        int alta = notas[0];
        
        for(int i=0; i<notas.length; i++)
            if(notas[i]>alta){
                alta = notas[i];
            }
    }
    
}
