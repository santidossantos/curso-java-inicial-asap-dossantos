package ejercicios.clase5.asapdemy;

import ejercicios.clase5.asapdemy.enums.LessonType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Lesson {

    public String name;
    public Integer duration;
    public LessonType type;

}
