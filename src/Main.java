import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int[] N = new int[5];

    public static void main(String[] args) {
        Main a = new Main();
        a.inputData();
        a.showStat();
    }

    public void inputData() {
        for (int i = 0; i < N.length; i++) {
            System.out.print("Input Number " + (i + 1) + " : ");
            int num = sc.nextInt();
            N[i] = num;
        }
    }

    int findMax() {
        int max = N[0];
        for (int i = 0; i < N.length; i++)
            if (max < N[i])
                max = N[i];
        return max;
    }

    int findMin() {
        int min = N[0];
        for (int i = 0; i < N.length; i++)
            if (min > N[i])
                min = N[i];
        return min;
    }

    int sumNum() {
        int sum = 0;
        for (int i = 0; i < N.length; i++)
            sum += N[i];
        return sum;
    }

    double average(int ave) {
        double avg = (double) ave / (double) N.length;
        return avg;
    }

    public void showStat() {
        int max = 0;
        int min = 0;
        int sum = 0;
        double avg = 0;
        max = findMax();
        min = findMin();
        sum = sumNum();
        avg = average(sum);
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println("SUM : " + sum);
        System.out.println("AVG : " + avg);
    }
}