package app;


import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Результат додавання: " + addition.operate(5, 7));


        StringManipulator toUpperCase = input -> input.toUpperCase();
        System.out.println("Верхній регістр: " + toUpperCase.manipulate("hello world"));


        Function<String, Integer> countUppercase = StringListProcessor::countUppercase;
        String testString = "Hello World!";
        System.out.println("Кількість великих літер у рядку \"" + testString + "\": " + countUppercase.apply(testString));


        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Випадкове число від 1 до 100: " + randomSupplier.get());
    }
}
