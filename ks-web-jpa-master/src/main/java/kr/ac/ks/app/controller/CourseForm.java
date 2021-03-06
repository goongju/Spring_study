package kr.ac.ks.app.controller;

import kr.ac.ks.app.domain.Lesson;
import kr.ac.ks.app.domain.Student;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CourseForm {
    private Long id;
    private Student studentId;
    private Lesson lessonId;

}
