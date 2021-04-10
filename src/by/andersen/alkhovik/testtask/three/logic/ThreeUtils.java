package by.andersen.alkhovik.testtask.three.logic;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ThreeUtils {
    public List<Integer> multipleOfThree(List<Integer> inputList){

        List<Integer> outputList = new ArrayList<>();

        for (Integer i : inputList){
            if ((i % 3) == 0){
                outputList.add(i);
            }
        }
        return outputList;
    }
    public List<Integer> input(){

        List<Integer> inputList = new ArrayList<>();
        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in)) {
            System.out.println("Введите количество чисел");
            int number = 0;
            number = scan.nextInt();
            System.out.println("Введите числа для выбора");

            for (int i = 0; i < number; i++) {
                inputList.add(scan.nextInt());
            }

        }catch (InputMismatchException e){
            System.out.println("Выввели некорректные данные");
        }
        return inputList;
    }
}
