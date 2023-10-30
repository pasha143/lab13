package ru.mirea.lab13;
public class Number1 {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        // Распечатать последний символ строки
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        // Проверить, заканчивается ли строка подстрокой "!!!"
        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Строка заканчивается на '!!!': " + endsWithExclamation);

        // Проверить, начинается ли строка подстрокой "I like"
        boolean startsWithILike = str.startsWith("I like");
        System.out.println("Строка начинается с 'I like': " + startsWithILike);

        // Проверить, содержит ли строка подстроку "Java"
        boolean containsJava = str.contains("Java");
        System.out.println("Строка содержит 'Java': " + containsJava);

        // Найти позицию подстроки "Java"
        int javaIndex = str.indexOf("Java");
        System.out.println("Позиция подстроки 'Java': " + javaIndex);

        // Заменить все символы "а" на "о"
        String replacedStr = str.replace('a', 'o');
        System.out.println("Строка после замены: " + replacedStr);

        // Преобразовать строку к верхнему регистру
        String upperCaseStr = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseStr);

        // Преобразовать строку к нижнему регистру
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseStr);

        // Вырезать подстроку "Java"
        String subStr = str.substring(str.indexOf("Java"), str.indexOf("Java") + 4);
        System.out.println("Вырезанная подстрока: " + subStr);
    }
}