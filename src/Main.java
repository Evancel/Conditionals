import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
    }

    public static void task1() {
        System.out.println("Task1");
        System.out.println("Введите возраст:");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if (age < 18) {
            System.out.printf("Если возраст человека равен %d, то он не достиг совершеннолетия, нужно немного подождать", age);
        } else {
            System.out.printf("Если возраст человека равен %d, то он совершеннолетний", age);
        }
    }

    public static void task2() {
        System.out.println("Task2");
        System.out.println("Введите температуру:");
        Scanner in = new Scanner(System.in);
        double temp = in.nextDouble();

        if (temp < 5) {
            System.out.printf(Locale.US, "На улице %.2f градусов, нужно надеть шапку", temp);
        } else {
            System.out.printf(Locale.US, "На улице %.2f градусов, можно идти без шапки", temp);
        }
    }

    public static void task3() {
        System.out.println("Task3");
        System.out.println("Введите скорость:");
        Scanner in = new Scanner(System.in);
        double speedPerHour = in.nextDouble();

        if (speedPerHour > 60) {
            System.out.printf(Locale.US, "Если скорость %.2f, то придется заплатить штраф", speedPerHour);
        } else {
            System.out.printf(Locale.US, "Если скорость %.2f, можно ездить спокойно", speedPerHour);
        }
    }

    public static void task4() {
        System.out.println("Task4");
        int age = 5;
        if (age >= 2 && age <= 6) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад.", age);
        } else if (age >= 7 && age <= 18) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу.", age);
        } else if (age > 18 && age <= 24) {
            System.out.printf("Если возраст человека равен %d, то его место в университете.", age);
        } else if (age > 24) {
            System.out.printf("Если возраст человека равен %d, то ему пора ходить на работу.", age);
        }
    }

    public static void task5() {
        System.out.println("Task5");
        int age = 13;

        if (age < 5) {
            System.out.printf("Если возраст ребенка равен %d, то он не может кататься на аттракционе.", age);
        } else if (age >= 5 && age < 14) {
            System.out.printf("Если возраст ребенка равен %d, то он может кататься только в сопровождении взрослого. " +
                    "Если взрослого нет, то кататься нельзя.", age);
        } else if (age >= 14) {
            System.out.printf("Если возраст ребенка равен %d, то он может кататься без сопровождения взрослого.", age);
        }
    }

    public static void task6() {
        System.out.println("Task6");
        int capacity = 102;
        int countSeats = 60;

        int countPeople = 103;

        if (countPeople <= countSeats) {
            System.out.println("В вагоне еще есть сидячие места");
        } else if (countPeople > countSeats && countPeople <= capacity) {
            System.out.println("В вагоне еще есть стоячие места");
        } else if (countPeople > capacity) {
            System.out.println("В вагоне больше нет мест");
        }
    }

    public static void task7(){
        System.out.println("Task7");
        int a = 6;
        int b = 6;
        int c = -1;

        if(a>=b && a>=c){
            System.out.printf("Наибольшее число = %d",a);
        } else if (b>=a && b>=c){
            System.out.printf("Наибольшее число = %d",b);
        } else if (c>=a && c>=b){
            System.out.printf("Наибольшее число = %d",c);
        }
    }
}