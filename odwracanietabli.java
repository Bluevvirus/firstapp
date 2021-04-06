package pl.fejral.firstapp;

public class odwracanietabli {

    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3};
        int[] arr = new int[tab.length];

        for(int i = 0; i < tab.length; i++) //pętla rusująca 1 tablice
            System.out.print(tab[i] + "  ");
        System.out.println();


        for(int i = 0; i < tab.length; i++) // pętla odwracająca tablice
            arr[i] = tab[tab.length - 1 - i];

        for(int i = 0; i < arr.length; i++) // tu drukujemy odwróconą tablice
            System.out.print(arr[i] + "  ");
        System.out.println();

    }
}
