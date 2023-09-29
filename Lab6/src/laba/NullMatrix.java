package laba;

public class NullMatrix implements Printable {
    private int[][] array;
    private int size;

    public NullMatrix(int size) {
        this.size = size;
        this.array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.array[i][j] = 0;
            }
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
