package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        int[] dati = {3, 5, 7, 9, 11, 13, 15};
        ArrayInteri array1 = new ArrayInteri(dati);

        System.out.println("Iterazione su array1");
        while (array1.hasAncoraElementi()) {
            System.out.println(array1.getElementoSuccessivo());
        }

        // System.out.println(array1.getElementoSuccessivo());
        // System.out.println(array1.hasAncoraElementi());
        // System.out.println(array1.getElementoSuccessivo());

        ArrayInteri array2 = new ArrayInteri();
        array2.addElemento(2);
        array2.addElemento(4);
        array2.addElemento(6);
        array2.addElemento(8);
        array2.addElemento(10);

        while (array2.hasAncoraElementi()) {
            System.out.println(array2.getElementoSuccessivo());
        }

    }
}
