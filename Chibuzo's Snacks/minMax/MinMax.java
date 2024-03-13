package minMax;

public class MinMax {

    public static int[] firstTry(int... numbers) {
        int min = getMinMax(1, numbers);
        int max = getMinMax(2, numbers);

        return new int[]{getMinMaxSum(max, numbers), getMinMaxSum(min, numbers)};
    }

    public static int[] secondTry(int... numbers) {
        int min = Integer.MAX_VALUE;
        int max = numbers[0];

        for(int number : numbers) {
            int sum = 0;
            sum = getSum(numbers, number, sum);
            if(sum < min) min = sum;
            if(sum > max) max = sum;
        }

        return new int[]{min, max};
    }

    private static int getSum(int[] numbers, int number, int sum) {
        for(int num : numbers) {
            if(number == num) continue;
            sum += num;
        }
        return sum;
    }

    private static int getMinMax(int flag, int... numbers) {
        if (flag == 1) {
            int min = numbers[0];
            for (int number : numbers) if (number < min) min = number;
            return min;
        }
        else {
            int max = numbers[0];
            for (int number : numbers) if (number > max) max = number;
            return max;
        }
    }

    private static int getMinMaxSum(int flag, int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number == flag) continue;
            sum += number;
        }

        return sum;
    }
}
