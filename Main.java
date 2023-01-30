/* Доделать проект(Использовать параметризацию)
Сохранение в файл, редактирование, чтение и удаление
Заготовка: https://github.com/besSmertniyKoder/untitled9
Дженерики и вайлдкардс: https://skillbox.ru/media/base/dzheneriki-v-java-dlya-samykh-malenkikh/ */

import Model.Student;
import Service.StudentService;
import Service.impls.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        studentService.add(new Student("Roman", 4.92f , 4));
    }


}
