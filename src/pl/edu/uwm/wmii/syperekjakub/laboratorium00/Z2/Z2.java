package pl.edu.uwm.wmii.syperekjakub.laboratorium00.Z2;

import java.util.Iterator;

public class Z2 {
    public static int[] x = {1,2,3};

    interface Iterable<E>{

    }

    public static <E> void wypiszCoDrugi(int[] x){
        for(int i=0; i<3; i++){
            if (i % 2 == 1){
                System.out.println('x' + ",");

            }

        }
    }

    public static void main(String[] args) {
        int[] x = {1,2,3};


    }
}
