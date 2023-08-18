package com.example.BeansLearnerLab;

import java.util.Iterator;
import java.util.Spliterator;

public class Students extends People<Student> {

    public Students() {
        super();
    }

    public Students(Student... students){
        super(students);
    }
}
