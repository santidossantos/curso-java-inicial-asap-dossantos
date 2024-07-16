package ejercicios.clase5.asapdemy;


import ejercicios.clase5.asapdemy.enums.SuscribeMessages;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

import static ejercicios.clase5.asapdemy.constants.Constants.MAX_SCHOLARSHIPS;
import static ejercicios.clase5.asapdemy.enums.SuscribeMessages.*;

@Data
public class Course {

    private int id;
    private String title;
    private String price;
    private int stars;
    private User author;
    private List<Lesson> lessons;
    private List<User> students;

    public Course(int id, String title, String price, int stars) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.stars = stars;
        this.students = new ArrayList<>();
        this.lessons = new ArrayList<>();
    }

    public SuscribeMessages suscribeUser(User student) {
        if(student == this.author) {
            return ES_AUTOR;
        }
        else if(this.students.contains(student)) {
            return YA_SUSCRIPTO;
        }
        else if(!this.hasReachedMaxScolarshipHolders()) {
            this.students.add(student);
            return SUSCRIPTO_OK;
        }
        return MAX_BECADOS;
    }

    private boolean hasReachedMaxScolarshipHolders() {
        return this.students.stream().filter(User::isScolarShipHolder).count() >= MAX_SCHOLARSHIPS;
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

}
