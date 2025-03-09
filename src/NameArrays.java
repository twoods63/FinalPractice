import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class NameArrays {
    public static void main(String[] args) {
        String[] names1D = {"Alice", "Bob", "Charlie", "David", "Emma"};
        System.out.println("1D Array: " + Arrays.toString(names1D));

        String[][] names2D = {
                {"Alice", "Bob", "Charlie"},
                {"David", "Emma", "Frank"},
                {"Grace", "Henry", "Ivy"}
        };
        System.out.println("2D Array:");
        for (String[] strings : names2D) {
            System.out.println(Arrays.toString(strings));
        }

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Charlie");
        nameList.add("David");
        nameList.add("Emma");
        System.out.print("ArrayList: " + nameList);
    }
    public static class RandomArrayFill {
        public static void main(String[] args) {
            int[] arr1D = new int[10];
            Random myRandom = new Random();

            for(int i = 0; i < arr1D.length; i++) {
                arr1D[i] = myRandom.nextInt(100);
            }
            System.out.print("1D Array: " + Arrays.toString(arr1D));

            int[][] arr2D = new int[3][3];
            for (int i = 0; i < arr2D.length; i++) {
                for (int j = 0; j < arr2D[i].length; i++) {
                    arr2D[i][j] = myRandom.nextInt(100);
                }
            }
            System.out.println("2D Array: ");
            for (int[] ints : arr2D) {
                System.out.println(Arrays.toString(ints));
            }

            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                arrayList.add(myRandom.nextInt(100));
            }
            System.out.println("ArrayList: " + arrayList);
        }
    }
}
