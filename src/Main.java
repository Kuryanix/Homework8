public class Main {
    public static void main(String[] args) {

        // ЗАДАЧИ 1,2,3 и 4

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 2; i > -1; i--) {
            if (numbers [i] % 2 != 0) {
                numbers [i] = numbers [i] + 1;
            }
            if (i == 0) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ",");
        }

        double[] numberdot = {1.57, 7.654, 9.986};
        for (int i = 2; i < numberdot.length; i--) {
            if (i == 0) {
                System.out.println(numberdot[i]);
                break;
            }
            System.out.print(numberdot[i] + ",");
        }

        char [] chars = {33, 1, 4209, 445, 109};
        for (int i = 4; i < chars.length; i--) {
            if (i == 0) {
                System.out.print(chars[i]);
                break;
            }
            System.out.print(chars[i] + ",");
        }
    }
}