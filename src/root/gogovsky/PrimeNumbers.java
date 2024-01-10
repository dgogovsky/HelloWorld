package root.gogovsky;

//ниже описан метод получения простого числа, просто вызываем его тут в цикле он 2 до 100
//Число 1 — не является ни простым, ни составным числом, так как у него только один делитель — 1.

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
//Простое число — это число, которое имеет только два делителя: 1 и само число. В интернете прочитал, что, чтобы проверить,
// является ли число простым, достаточно проверить все числа от 2 до квадратного корня из num включительно. (математика)

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

