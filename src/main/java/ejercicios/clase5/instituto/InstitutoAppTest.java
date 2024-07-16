package ejercicios.clase5.instituto;

import ejercicios.clase5.instituto.enums.SubjectStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class InstitutoAppTest {

    private Career career;
    private Subject subject1;
    private Subject subject2;
    private Student student1;
    private Student student2;
    private Student student3;

    @BeforeEach
    public void setUp() {
        career = new Career("Ingeniería en Sistemas");

        subject1 = new Subject("Algoritmos y Estructuras de Datos");
        subject2 = new Subject("Base de Datos");

        student1 = new Student("Juan", "juan@gmail.com");
        student2 = new Student("Pedro", "pedro@gmail.com");
        student3 = new Student("María", "maria@gmail.com");

        career.addStudent(student1);
        career.addStudent(student2);
        career.addStudent(student3);
    }

    @Test
    public void testInformeMaxMaterias() {
        student1.addSubject(new TakenSubject("2021-1", SubjectStatus.APPROVED, subject1));
        student1.addSubject(new TakenSubject("2021-2", SubjectStatus.APPROVED, subject2));

        student2.addSubject(new TakenSubject("2021-1", SubjectStatus.APPROVED, subject1));
        student2.addSubject(new TakenSubject("2021-2", SubjectStatus.REJECTED, subject2));

        List<Report> reports = career.getInformeMaxMaterias();

        reports.forEach(System.out::println);
    }

}
