import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        //task2
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - "+fullNameUpperCase);

        //task3
        fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace('ё','е');

        System.out.println("Данные Ф.И.О. сотрудника - "+  newFullName);
    }
}