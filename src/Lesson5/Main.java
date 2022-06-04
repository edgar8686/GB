package Lesson5;

public class Main {
    public static void main(String[] args) {
    Employee[] persArray = new Employee[5];
    persArray[0] = new Employee("Pecher Pecherkin", "QA Engineer", "pecherkin@gmail.com", "89341234567", 32000, 34);
    persArray[1] = new Employee("Magomed Magomedov", "Product manager", "magomedov@mail.ru", "89548761256", 41000, 41);
    persArray[2] = new Employee("Timur Uzbekov", "QA Engineer automation", "uzbekov@gmail.com", "89671350956", 50000, 29);
    persArray[3] = new Employee("Petr Dubovoy", "Project manager", "dubovoy@inbox.ru", "89037830948", 45000, 43);
    persArray[4] = new Employee("Aleksey Chernomyrdin", "Java develonpment", "cher@gmail.com", "89780378940", 55000, 32);
    for (int i = 0; i < persArray.length; i++) {
        if (persArray[i].getAge() > 40) {
           persArray[i].consoleEmployee();
        }
    }
    }
}
