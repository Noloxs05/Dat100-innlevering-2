package no.hvl.dat100.tabeller;

import java.util.Arrays;

public class Tabeller {
	//test
    public static void main(String[] args) {
        int[] tabell1 = {1, 3, 5, 7, 8, 10};
        int[] tabell2 = {47, 67, 89};

        // a) 
        System.out.println("Tabell 1: " + tilStreng(tabell1));

        // b) 
        System.out.println("Tabell 2: " + tilStreng(tabell2));

        // c) 
        System.out.println("Summen av tabell 1 er: " + summer(tabell1));

        // d) 
        System.out.println("Finnes tallet 5 i tabell 1? " + finnesTall(tabell1, 5));

        // e) 
        System.out.println("Posisjonen til tallet 7 i tabell 1 er: " + posisjonTall(tabell1, 7));

        // f) 
        int[] reversertTabell1 = reverser(tabell1);
        System.out.println("Reversert tabell 1: " + Arrays.toString(reversertTabell1));

        // g) 
        System.out.println("Er tabell 1 sortert? " + erSortert(tabell1));

        // h) 
        int[] sammensattTabell = settSammen(tabell1, tabell2);
        System.out.println("Sammensatt tabell: " + Arrays.toString(sammensattTabell));
    }

    // a) 
    public static String tilStreng(int[] tabell) {
        return Arrays.toString(tabell);
    }

    // c) 
    public static int summer(int[] tabell) {
        int sum = 0;
        for (int tall : tabell) {
            sum += tall;
        }
        return sum;
    }

    // d) 
    public static boolean finnesTall(int[] tabell, int tall) {
        for (int element : tabell) {
            if (element == tall) {
                return true;
            }
        }
        return false;
    }

    // e) 
    public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1; 
    }

    // f) 
    public static int[] reverser(int[] tabell) {
        int[] reversert = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
            reversert[i] = tabell[tabell.length - 1 - i];
        }
        return reversert;
    }

    // g) 
    public static boolean erSortert(int[] tabell) {
        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] < tabell[i - 1]) {
                return false; 
            }
        }
        return true; 
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] sammensatt = new int[tabell1.length + tabell2.length];
        for (int i = 0; i < tabell1.length; i++) {
            sammensatt[i] = tabell1[i];
        }
        for (int i = 0; i < tabell2.length; i++) {
            sammensatt[tabell1.length + i] = tabell2[i];
        }
        return sammensatt;
    }
}
