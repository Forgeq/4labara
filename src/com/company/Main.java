package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Main labar = new Main();

        labar.MaxMin();
        labar.increase();
        labar.Mean();
        labar.Sum();
        labar.table3x5();
        labar.FiveLines();
        labar.maxX();
    }

    void MaxMin() {
        System.out.println("Вывод первого задания:");
        int n = 25;
        int arr[] = new int[n];
        Random r = new Random();

        int indexMin = 0;
        int indexMax = 0;

        System.out.println("Массив: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            if (arr[i] > arr[indexMax])
                indexMax = i;
            else if (arr[indexMin] > arr[i])
                indexMin = i;
        }

        System.out.println("\nМаксимвльный -> " + arr[indexMax]); // answer to task 6

        int tmp = arr[indexMax];
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = tmp;

        System.out.println("массив после изменений мин и макс значений: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + "\t");
        }
    }

    void increase() {
        System.out.println("\n\nВывод второго задания");
        int n = 25;
        int arr[] = new int[n];
        Random r = new Random();
        System.out.println("\nМассив : ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nМассив по возрастанию:");
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + "\t");
        }
    }

    void Mean() {
        System.out.println("\n\nВыывод третего задания:");
        int average = 0;
        int n = 20;
        int arr[] = new int[n];
        Random r = new Random();
        System.out.println("Массив: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            average += arr[i];
        }
        average /= n;
        System.out.println("\nСреднее значение -> " + average);
    }

    void Sum() {
        System.out.println("\n\nВывод четвертого задания.");
        int n = 30;
        int sumOfEven = 0;
        int sumOdd = 0;
        int arr[] = new int[n];
        Random r = new Random();
        System.out.println("Массив: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            if (arr[i] % 2 == 0) {
                sumOfEven += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        System.out.println("\nСумма четных чисел -> " + sumOfEven);
        System.out.println("Нечетная сумма -> " + sumOdd);
    }


    void table3x5() {
        System.out.println("\nВывод пятого задания.");
        int arr[][] = new int[3][5];
        Random r = new Random();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 5; ++j) {
                arr[i][j] = r.nextInt(100);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void FiveLines() {
        System.out.println("\n\nВывод шестго задания.");
        String s1 = "привет",
                s2 = ", здрст!",
                s3 = ",як ты?",
                s4 = "привет",
                s5 = "пока";
        if (s4.equals(s5)) {
            System.out.print(s1 + s2);
        } else {
            System.out.print(s1 + s3);
        }
    }

    void maxX() {
        System.out.println("\n\nНахождение макс элемента");
        int n = 25;
        int arr[] = new int[n];
        Random r = new Random();
        int indexMax = 0;
        System.out.println("Начальный массив: ");
        for (int i = 0; i < n; ++i) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + "\t");
            if (arr[i] > arr[indexMax])
                indexMax = i;
        }
        System.out.println("\nМакс элемент массива: " + arr[indexMax]);
    }
}