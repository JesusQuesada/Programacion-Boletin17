package boletin17.pkg2;

import javax.swing.JOptionPane;

public class DAM {

    int[] notas = {6, 4, 8, 7};
    String[] nombres = {"Mario", "Marta", "Araceli", "Diego"};
    int aprobados = 0;
    int suspensos = 0;

    public void calcularAprobados() {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
    }

    public void calcularSuspensos() {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                suspensos++;
            }
        }
        System.out.println("Suspensos: " + suspensos);
    }

    public void notaMedia() {
        int media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
        }

        System.out.println("Media:" + media / notas.length);
    }

    public void notaMasAlta() {
        int alta = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > alta) {
                alta = notas[i];
            }
        }
        System.out.println("Nota más alta: " + alta);
    }

    public void visualizarNombreyNota(String nombre) {
        for (int i = 0; i < notas.length; i++) {
            if (nombres[i].equals(nombre)) {
                System.out.println("Nombre: " + nombres[i] + "\n Nota: " + notas[i]);
            }
        }
    }

    public void visualizarporTeclado() {
        String nombre = JOptionPane.showInputDialog("Introduce nombre: ");
        for (int i = 0; i < notas.length; i++) {
            if (nombres[i].equals(nombre)) {
                System.out.println("Nombre: " + nombres[i] + "\n Nota: " + notas[i]);
            }
        }
    }

    public void visualizarAprobados() {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println("Aprobado: " + nombres[i]);
            }
        }
    }

    public void ordenar() {
        int aux;
        String auxNom;
        for (int i = 0; i < notas.length-1; i++) {
            for (int j = i+1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    auxNom = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = auxNom;
                }
            }
        }
        
    }

    public void visualizar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nombre: " + nombres[i] + "\n Nota: " + notas[i]);
        }
    }

}
