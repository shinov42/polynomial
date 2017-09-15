import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        int mass[] = new int [5];
        int mass1[] = new int [5];
        int x = 0;
        int numb;
        boolean flag = true;
        while(flag) {
            System.out.println("1 - сложение двух полиномов");
            System.out.println("2 - разность двух полиномов");
            System.out.println("3 - произведение двух полиномов");
            System.out.println("4 - расчёт значения при заданном x");
            System.out.println("5 - сравнение на равенство");
            System.out.println("6 - найти результат деления одного полинома на другой");
            System.out.println("7 - найти остаток от деления двух полиномов");
            System.out.println("8 - выход");
            Scanner scan = new Scanner(System.in);
            numb = scan.nextInt();
            switch (numb) {
                case 1: {
                    poly.get(mass);
                    poly.get(mass1);
                    poly.summ(mass, mass1);
                    break;
                }
                case 2: {
                    poly.get(mass);
                    poly.get(mass1);
                    poly.minus(mass, mass1);
                    break;
                }
                case 3: {
                    poly.get(mass);
                    poly.get(mass1);
                    poly.multiple(mass, mass1);
                    break;
                }
                case 4: {
                    poly.get(mass);
                    x =  poly.get_x(x);
                    poly.solve(mass,x);
                    break;
                }
                case 5: {
                    poly.get(mass);
                    poly.get(mass1);
                    poly.equal(mass,mass1);
                    break;
                }
                case 6: {
                    poly.get(mass);
                    poly.get(mass1);
                    poly.division(mass, mass1, 1);
                    break;
                }
                case 7: {
                    poly.get(mass);
                    poly.get(mass1);
                    poly.division(mass, mass1, 2);
                    break;
                }
                case 8:{
                    flag = false;
                    break;
                }
                default:{
                    System.out.println("Неизвестная команда. Повторите попытку.");
                    break;
                }
            }
        }
    }
}
