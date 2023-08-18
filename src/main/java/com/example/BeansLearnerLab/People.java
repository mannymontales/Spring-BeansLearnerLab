package com.example.BeansLearnerLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    //Upon construction People should consume a List of PersonType and set it to a respective personList field.
    List<PersonType> personList = new ArrayList<>();

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    @SafeVarargs
    public People(PersonType...people) {
        for (PersonType element: people) {
            personList.add(element);
        }
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    //person iterable consisting of person type objects
    public void addAll(Iterable<PersonType> person) {
//        for (PersonType element: person) {
//            personList.add(element);
//        }
        person.forEach(personType -> personList.add(personType));
    }

    public PersonType findById(long id) {
//        for (PersonType element: personList) {
//            if (element.getId() == id){
//                return element;
//            }
//        }
//        return null;

        return (PersonType) personList.stream().filter(personType -> personType.getId() == id);
    }

    public List<PersonType> findAll() {
        return personList;
    }

    // Haha, Milky Keyboard go brrrrrrrrr

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
