package ejercicios.clase5.instituto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Report {

    private final String studentName;
    private final String studentEmail;
    private final Integer approvedSubjects;

    @Override
    public String toString() {
        return "Student: " + studentName + " - Email: " + studentEmail + " - Approved subjects: " + approvedSubjects;
    }

}
