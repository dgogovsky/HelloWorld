package root.gogovsky;

import java.util.Arrays;

public class ArrayAggregates {
    public static void main(String[] args) {
        int size = 10;
        double[] array = new double[size];

        // Заполнение массива случайными числами
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }

        // Вычисление максимального, минимального и среднего значения
        double max = Arrays.stream(array).max().getAsDouble();
        double min = Arrays.stream(array).min().getAsDouble();
        double average = Arrays.stream(array).average().getAsDouble();

        // Вывод массива в строку, по идее не нужно для задачи, но пусть будет
        System.out.println("Массив: " + Arrays.toString(array));

        // Вывод результатов

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);
    }
}