package by.andersen.alkhovik.testtask.seven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in)) {

            System.out.println("Введите любое число");

            int number = scan.nextInt();

            if (number > 7) {
                System.out.println("Привет");
            }
        }catch (InputMismatchException e){
            System.out.println("Выввели некорректные данные");
        }
    }
}
