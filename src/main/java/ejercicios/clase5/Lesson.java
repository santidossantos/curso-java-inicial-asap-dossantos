package ejercicios.clase5;

import ejercicios.clase5.enums.LessonType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Lesson {

    public String name;
    public Integer duration;
    public LessonType type;

}
