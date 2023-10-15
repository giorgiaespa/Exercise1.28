public class Exercise28 {
    public static void main(String args[]) {
        int [][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] swiped = new int [numbers[0].length][numbers.length];

        swipeRaC(numbers, swiped);
    }

    public static void swipeRaC (int[][] array, int[][] array2){
        for (int i = 0; i < array[0].length; i++){
            for (int j = 0; j < array.length; j++){
                array2[j][i] = array[j][i];
                System.out.print(array2[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}