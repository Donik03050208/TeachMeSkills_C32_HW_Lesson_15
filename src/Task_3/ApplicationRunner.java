package Task_3;

import Task_3.Service.InputValidator;
import Task_3.Service.RandomNumbersGenerator;

import java.util.List;
import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = 0;
        boolean validInput = false;
        while (!validInput){
            System.out.println("Enter collection size:");
            String input = scanner.nextLine();
            try {
                size = InputValidator.getValidatedSize(input);
                validInput = true;

            } catch (NumberFormatException e){
                System.out.println("Please enter a valid integer.");
            }
        }
        List<Integer> numbers = RandomNumbersGenerator.generateRandomNumbers(size ,100);
        double sum = 0;
        for(int number : numbers){
            sum += number;
        }
        double average = sum/ size;
         System.out.println("Collection of numbers: " + numbers);
         System.out.println("Arithmetic mean: " + average);


            }
        }


