package com.school.project.model;

public enum AccountType {
    TEACHER(1, "Teacher"),
    ADMIN(2, "Admin"),
    STUDENT(3, "Student");

    AccountType(Integer id, String name) {
    }

}