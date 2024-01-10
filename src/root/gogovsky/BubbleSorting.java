package root.gogovsky;

// Метод для сортировки массива пузырьком
//В условии цикла j < n-i-1 используется n-i-1 вместо n для оптимизации. После каждого прохода внешнего цикла
// (после каждого i), самый большой элемент “всплывает” к концу массива.

public class BubbleSorting {

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                // Если текущий элемент больше следующего
                if (arr[j] > arr[j+1]) {
                    // Меняем элементы местами
                    int temp = arr[j]; //сохраняем текущий элемент в темп при проходе
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    // Метод для вывода массива
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Для вывода тестового отсортированного массива
    public static void main(String args[]) {
        BubbleSorting ob = new BubbleSorting();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Отсортированный массив");
        ob.printArray(arr);
    }
}