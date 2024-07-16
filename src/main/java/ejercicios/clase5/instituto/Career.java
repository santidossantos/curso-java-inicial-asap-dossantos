package ejercicios.clase5.instituto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Career {

    private String name;
    private List<Student> students;

    public Career(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public List<Report> getInformeMaxMaterias() {
        return this.students.stream()
                .sorted((student1, student2) -> student2.approvedSubjectsCount().compareTo(student1.approvedSubjectsCount()))
                .map(student -> new Report(student.getName(), student.getMail(), student.approvedSubjectsCount())).toList();
    }
}
