package com.sky.student;

public class StudentRunner {
    public static void main(String[] args) {
        Student stu = new Student("Hank", 1, 60);
        stu.print();
        System.out.println("High score:" + stu.highest());
    }
}
