package com.example.BeansLearnerLab;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {

        double learnerCount = 0;
        for (Learner element: learners) {
            learnerCount++;
        }

        double numberOfHoursPerLearner = numberOfHours / learnerCount;

        //learners is the stream and for each learners apply the method learn(numberOfHoursPerLearner)
        learners.forEach(learner -> learner.learn(numberOfHoursPerLearner));

    }
}
