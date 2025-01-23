package arrays.onedimensional;

public class ArraysIntroduction {
    public static void main(String[] args) {
        double[] notes = new double[4];
        notes[0] = 7.5;
        notes[1] = 8;
        notes[2] = 3;
        notes[3] = 6;
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);
        }
    }
}
