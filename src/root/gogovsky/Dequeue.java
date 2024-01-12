package root.gogovsky;
// ArrayList используется для работы с массивом раной длины, а Arrays, чтобы делать с ним операции
import java.util.ArrayList;
import java.util.Arrays;

public class Dequeue {
    public static void main(String[] args) {
        // Такой исходный массив и число для удаления
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int num = 2;

        // Вызов функции для удаления элементов
        arr = removeElement(arr, num);

        // Вывод результата
        System.out.println(Arrays.toString(arr));
    }

    public static int[] removeElement(int[] nums, int val) {
        // Создание нового списка для хранения результата
        ArrayList<Integer> list = new ArrayList<>();

        // Перебор элементов исходного массива
        for (int num : nums) {
            // Если элемент не равен заданному числу, добавляем его в список
            if (num != val) {
                list.add(num);
            }
        }

        // Преобразование списка обратно в массив
        int[] newArr = new int[list.size()];
        //проходим по циклу и формируем лист элементами с каждой итерации
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }

        // Возвращаем новый массив
        return newArr;
    }
}
