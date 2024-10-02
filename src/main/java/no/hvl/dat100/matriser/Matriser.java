package no.hvl.dat100.matriser;

public class Matriser {

    // a) 
    public static void skrivUt(int[][] matrise) {
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print(matrise[i][j] + " ");
            }
            System.out.println(); 
        }
    }

    // b) 
    public static String tilStreng(int[][] matrise) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                sb.append(matrise[i][j]).append(" ");
            }
            sb.append("\n"); 
        }
        return sb.toString();
    }

    // c) 
    public static int[][] skaler(int tall, int[][] matrise) {
        int[][] nyMatrise = new int[matrise.length][matrise[0].length]; 
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                nyMatrise[i][j] = matrise[i][j] * tall; 
            }
        }
        return nyMatrise;
    }

    // d) 
    public static boolean erLik(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length) {
            return false; 
        }
        for (int i = 0; i < mat1.length; i++) {
            if (mat1[i].length != mat2[i].length) {
                return false; 
            }
            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false; 
                }
            }
        }
        return true; 
    }

    // f) 
    public static int[][] multipliser(int[][] a, int[][] b) {
        throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
    }

    // g) 
    public static int[][] speile(int[][] matrise) {
        throw new UnsupportedOperationException("Metoden speile ikke implementert");
    }
}
