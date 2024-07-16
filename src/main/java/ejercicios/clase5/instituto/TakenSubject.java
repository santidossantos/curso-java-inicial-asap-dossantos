package ejercicios.clase5.instituto;

import ejercicios.clase5.instituto.enums.SubjectStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TakenSubject {

    private String period;
    private SubjectStatus status;
    private Subject subject;

}
