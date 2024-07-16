package ejercicios.clase5.instituto;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

import static ejercicios.clase5.instituto.enums.SubjectStatus.APPROVED;


@Data
public class Student {

    private String name;
    private String mail;
    private List<TakenSubject> takenSubjects;

    public Student(String name, String mail) {
        this.name = name;
        this.mail = mail;
        this.takenSubjects = new ArrayList<>();
    }

    public Integer approvedSubjectsCount() {
        return (int) takenSubjects.stream().filter(subject -> subject.getStatus().equals(APPROVED)).count();
    }

}
