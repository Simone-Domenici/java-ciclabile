package org.lessons.java;

public class ArrayInteri {
    private int[] array;
    private int count;
    private int index;

    public ArrayInteri(int[] array) {
        if(array == null) {
            this.array = new int[0];
            this.count = 0;
        } else {
            this.array = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                this.array[i] = array[i];
            }
            this.count = array.length;
        }
        this.index = 0;
    }

    public ArrayInteri() {
        this.array = new int[0];
        this.count = 0;
        this.index = 0; 
    }

    public void addElemento(int x) {
        int[] newArray = new int[count + 1];
        for (int i = 0; i < count; i++) {
            newArray[i] = this.array[i];
        }
        newArray[count] = x;
        this.array = newArray;
        count++;
    }

    public int getElementoSuccessivo() {
        if (!hasAncoraElementi()) {
            throw new IndexOutOfBoundsException("Non ci sono più elementi");
        }
        return array[index++];
    }

    public boolean hasAncoraElementi() {
        return index < count;
    }

    // metodo aggiuntivo opzionale
    public void resetIterazione() {
        index = 0;
    }
}
