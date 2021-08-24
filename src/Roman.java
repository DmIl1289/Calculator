
public class Roman extends Calculator {

    public static int romanCalculator(String[] str) {
        // сравниваем поступающие строки со строками объектов enum
        // в дальнейшем присваиваем целочисленные значения новым переменным
        // здесь же проверяются вводимые строки и выбрасывается исключение несоответствующее перечислению
        RomanNumeral numeralA = RomanNumeral.valueOf(str[0]);
        RomanNumeral numeralB = RomanNumeral.valueOf(str[2]);
        int i = numeralA.getArabic();
        int j = numeralB.getArabic();
        int total;
           switch (str[1]) {
                case "+":
                    total = i + j;
                    break;
                case "-":
                    total = i - j;
                    break;
                case "*":
                    total = i * j;
                    break;
                case "/":
                    total = i / j;
                    break;
                default:
                    throw new IllegalArgumentException("Неверный оператор");
            }
                return total;
        }


    public static void romanToArabic(int i) {
        if (i < 1){
            throw new IllegalArgumentException("У римских цифр нет отрицательного значения и значения 0");
        }
        // преобразуем поступившее целочисленное значение в строку римских цифр
        StringBuilder sb = new StringBuilder();

        while (i >= 100) {
            sb.append("C");
            i -= 100;
        }
        while (i >= 90) {
            sb.append("XC");
            i -= 90;
        }
        while (i >= 50) {
            sb.append("L");
            i -= 50;
        }
        while (i >= 40) {
            sb.append("XL");
            i -= 40;
        }
        while (i >= 10) {
            sb.append("X");
            i -= 10;
        }
        while (i >= 9) {
            sb.append("IX");
            i -= 9;
        }
        while (i >= 5) {
            sb.append("V");
            i -= 5;
        }
        while (i >= 4) {
            sb.append("IV");
            i -= 4;
        }
        while (i >= 1) {
            sb.append("I");
            i -= 1;
        }
        System.out.println(sb);
    }
}


