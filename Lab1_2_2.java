
package lab.pkg1_2_2;

import java.util.Scanner;
public class Lab1_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        
        String s1;
       
        
        
        System.out.println("Добрий день! Введіть Ваше імя, прізвище та по-батькові");
        Scanner name10 = new Scanner(System.in);
       
        s1 = name10.nextLine();
        System.out.println("Напишіть будь ласка, скільки Вам повних років: ");
        
        int age = name10.nextInt(); 
        
        System.out.println("Напишіть будь ласка, скільки часу Ви займаєтесь програмуванням? ");
        System.out.println("Введіть число (роки)");
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        System.out.println("Напишіть скільки Ви знаєте мов? Цифрою");
        b = scn.nextInt();
        System.out.println("Напишіть яку бажаєте зарплату? ");
        c = scn.nextInt();
        
       
        
        
    }
    
}
