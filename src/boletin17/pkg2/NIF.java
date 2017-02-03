
package boletin17.pkg2;

public class NIF {
    char nif[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
    public void calcularNif(int dni){
        int resto = dni%23;
            System.out.println("La letra es: " +nif[resto]);
        }
    }

