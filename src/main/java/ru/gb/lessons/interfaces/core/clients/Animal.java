package ru.gb.lessons.interfaces.core.clients;

import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.supports.Record;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  Абстракция животного - пациента ветклиники.
 */
public abstract class Animal {
    protected final String CLASS_NAME = "The " + getClass().getSimpleName();
    //Поля класса отвечают за СОСТОЯНИЕ объекта
    protected int id; //идентификатор животного для хранения в БД
    protected String name; // кличка животного
    protected int numberOfLimbs; //количество конечностей
    protected LocalDate registrationDate; //дата регистрации животного в клинике
    protected Owner owner; // тот, кто принес животное в клинику
    protected List<Record> records; // записи о болезнях животного

    public Animal() {
    }

    public Animal(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        this.id = id;
        this.name = name;
        this.numberOfLimbs = numberOfLimbs;
        this.registrationDate = registrationDate;
        this.owner = owner;
        this.records = new ArrayList<>();
    }
    // Методы класса отвечают за ПОВЕДЕНИЕ объекта
    protected void addRecord(Record record) {
        //todo реализовать
    }

    //public void fly() {
    //    System.out.println(CLASS_NAME + " flying.");
    // }

    // public void swim() {
    //     System.out.println(CLASS_NAME + " swims.");
    // }

    // public void run() {
    //     System.out.println(CLASS_NAME + " is moving.");
    // }

    //todo ПО ПРАВИЛАМ "ЧИСТОГО КОДА", МЕТОДЫ, ВЫЗЫВАЕМЫЕ ВНУТРИ ДРУГОГО МЕТОДА,
    // ЛУЧШЕ РАСПОЛАГАТЬ СРАЗУ ПОД ЭТИМ МЕТОДОМ
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        System.out.println("What to do after a successful hunt?");
        sleep();
    }

    private void wakeUp() {
        System.out.println(CLASS_NAME + " wake up!");
    }

    private void findFood() {
        System.out.println(CLASS_NAME + " found food!");
    }

    private void eat() {
        System.out.println(CLASS_NAME + " ate.");
    }

    private void sleep() {
        System.out.println(CLASS_NAME + " sleeping...");
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(int numberOfLimbs) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
    @Override
        public String toString() {
            return CLASS_NAME + "{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", numberOfLimbs=" + numberOfLimbs +
                    ", registrationDate=" + registrationDate +
                    ", owner=" + owner +
                    ", records=" + records +
                    '}';
        }
    public String getClassName() {
        return this.CLASS_NAME;
    }    
}
