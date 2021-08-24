import java.util.Scanner;

public class Calculator {
    // массив для определения ввода арабских строк
    private static final String[] inputNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static void main(String[] args) {
        System.out.println("Калькулятор.\n" + "Работает с арабскими цифрами 1-10 и римскими цифрами I-X.\n" +
                "Умеет складывать, вычитать, умножать, делить.\n" +
                "Числа и операторы необходимо вводить через пробел.");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            // создаем новый массив из строк через пробел
            String[] input = line.split(" ");
            // проверяем длину массива, значение должно быть 3
          if (input.length != 3) {
                throw new IllegalArgumentException("Не соответствует параметрам математических операций данного калькулятора");
          }
            // проверяем арабские это цифры, запускаем соответствующие методы
                for (int i = 0; i < inputNumbers.length; i++) {
                    if (input[0].equals(inputNumbers[i])) {
                        Arabic.calculator(input);
                        break;
                    } else if (i == inputNumbers.length - 1) {
                                int d = Roman.romanCalculator(input);
                                Roman.romanToArabic(d);
                    }
                }
        }
    }
}













