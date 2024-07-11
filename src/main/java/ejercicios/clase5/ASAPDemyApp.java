package ejercicios.clase5;

import ejercicios.clase5.enums.LessonType;
import ejercicios.clase5.enums.SuscribeMessages;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ejercicios.clase5.enums.SuscribeMessages.CURSO_INEX;
import static ejercicios.clase5.enums.SuscribeMessages.USUARIO_INEX;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ASAPDemyApp {

    User u1;
    User u2;
    User becado1;
    User becado2;
    User becado3;
    User becado4;
    User becado5;
    User becado6;
    User u3;
    List<User> users;
    List<Course> courses;

    @BeforeEach
    void setUp() {
        this.u1 = new User(1, "Juan", "juan@gmail.com", false);
        this.u2 = new User(2, "Pedro", "", false);
        this.u3 = new User(9, "Maria", "", false);
        this.becado1 = new User(3, "Becado1", "", true);
        this.becado2 = new User(4, "Becado2", "", true);
        this.becado3 = new User(5, "Becado3", "", true);
        this.becado4 = new User(6, "Becado4", "", true);
        this.becado5 = new User(7, "Becado5", "", true);
        this.becado6 = new User(8, "Becado6", "", true);
        this.users = Arrays.asList(u1, u2, u3, becado1, becado2, becado3, becado4, becado5, becado6);

        Course curso1 = new Course(1, "Curso de Java", "100", 5);
        Course curso2 = new Course(2, "Curso de Python", "100", 5);
        this.courses = Arrays.asList(curso1, curso2);

        Category cat1 = new Category(1, "Programacion");
        cat1.addCourse(curso1);
        cat1.addCourse(curso2);

        Lesson l1 = new Lesson("Clase 1", 2, LessonType.RESOURCE);
        Lesson l2 = new Lesson("Clase 2", 2, LessonType.VIDEO);

        curso1.addLesson(l1);
        curso2.addLesson(l2);
    }

    private SuscribeMessages suscribirseACurso(int userId, int courseId) {
        User user = this.users.stream().filter(u -> u.getId() == userId).findFirst().orElse(null);
        Course course = this.courses.stream().filter(c -> c.getId() == courseId).findFirst().orElse(null);

        if(user == null) {
            return USUARIO_INEX;
        }
        if(course == null) {
            return CURSO_INEX;
        }

        return course.suscribeUser(user);
    }

    @Test
    public void testSuscribeOk() {
        Course course = this.courses.stream().findFirst().orElse(null);
        assertEquals(SuscribeMessages.SUSCRIPTO_OK, suscribirseACurso(this.u1.getId(), course.getId()));
        assertEquals(SuscribeMessages.SUSCRIPTO_OK, suscribirseACurso(this.becado1.getId(), course.getId()));
        assertEquals(2, course.getStudents().size());
    }

    @Test
    public void testUserInex() {
        assertEquals(USUARIO_INEX, suscribirseACurso(99999, 1));
    }

    @Test
    public void testCourseInex() {
        assertEquals(CURSO_INEX, suscribirseACurso(1, 99999));
    }

    @Test
    public void testUserAlreadySuscribed() {
        Course course = this.courses.stream().findFirst().orElse(null);
        assertEquals(SuscribeMessages.SUSCRIPTO_OK, suscribirseACurso(this.u1.getId(), course.getId()));
        assertEquals(SuscribeMessages.YA_SUSCRIPTO, suscribirseACurso(this.u1.getId(), course.getId()));
    }

    @Test
    public void testUserIsAuthor() {
        Course course = this.courses.stream().findFirst().orElse(null);
        course.setAuthor(this.u3);
        assertEquals(SuscribeMessages.ES_AUTOR, suscribirseACurso(this.u3.getId(), course.getId()));
    }

    @Test
    public void testMaxScholarships() {
        Course course = this.courses.stream().findFirst().orElse(null);
        assertEquals(SuscribeMessages.SUSCRIPTO_OK, suscribirseACurso(this.becado1.getId(), course.getId()));
        assertEquals(SuscribeMessages.SUSCRIPTO_OK, suscribirseACurso(this.becado2.getId(), course.getId()));
        assertEquals(SuscribeMessages.SUSCRIPTO_OK, suscribirseACurso(this.becado3.getId(), course.getId()));
        assertEquals(SuscribeMessages.SUSCRIPTO_OK, suscribirseACurso(this.becado4.getId(), course.getId()));
        assertEquals(SuscribeMessages.SUSCRIPTO_OK, suscribirseACurso(this.becado5.getId(), course.getId()));
        assertEquals(SuscribeMessages.MAX_BECADOS, suscribirseACurso(this.becado6.getId(), course.getId()));
    }

}
