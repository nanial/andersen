package by.andersen.alkhovik.testtask.slava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        try (@SuppressWarnings("")
                Scanner scan = new Scanner(System.in)) {

            System.out.println("Введите любое имя");

            String name = scan.nextLine();

            if (name.equalsIgnoreCase("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else System.out.println("Нет такого имени");
        }catch (InputMismatchException e){
            System.out.println("Выввели некорректные данные");
        }
    }
}
