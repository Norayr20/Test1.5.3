public class Numbers {
    public static void main(String[] args) {
        int[] array1 = new int[]{0,1,2,3,4,5,6,7,7};
        printArray(array1);
    }
    public static void printArray(int[] numbers) {
        System.out.println("[");
        for (int a = 0; a < numbers.length; a++) {
            if (a < numbers.length - 1)

                System.out.println(numbers[a] + ",");
        else {
                System.out.println(numbers[a]);
            }
        }
        System.out.println("]");
    }
}
