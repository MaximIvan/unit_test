import java.util.ArrayList;
import java.util.Random;

public class NumList {
    private double average;
    private ArrayList<Integer> array;

    public NumList(int len) {
        ArrayList arr = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            Random rnd = new Random();
            arr.add(rnd.nextInt(10));
        }
        this.array = arr;
    }
    public double getAverage() {
        for (int i = 0; i < array.size()-1; i++) {
            average = average + array.get(i);
        }
        average = average/array.size();
        return average;
    }


    public ArrayList<Integer> getArray() {
        return array;
    }

    public int getArrayLength() {
        return array.size();
    }

    public void setArray(ArrayList<Integer> array) {
        this.array = array;
    }
}
