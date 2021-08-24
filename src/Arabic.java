public class Arabic extends Calculator {
    public static void calculator(String[] str) {
        // преобразуем значение в массиве из строчного в целочисленное
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        int total;

        if (a > 0 && a < 11 && b > 0 && b < 11) {
            switch (str[1]) {
                case "+":
                    total = a + b;
                    break;
                case "-":
                    total = a - b;
                    break;
                case "*":
                    total = a * b;
                    break;
                case "/":
                    total = a / b;
                    break;
                default:
                    throw new IllegalArgumentException("Неверный оператор");
            }
            System.out.println(total);
        } else {
            throw new IllegalArgumentException("Числа могут быть только от 1 до 10!");

        }

    }
}
