package com.kodilla.stream.forumuser;

import java.time.*;

public class ForumUser {
    private final int userId;
    private final int posts;
    private final char sex;
    private final String userName;
    private final LocalDate birthDate;

    public ForumUser(final int userId, final String userName, final int posts, final char sex,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth) {
        this.userId = userId;
        this.posts = posts;
        this.sex = sex;
        this.userName = userName;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public int getUserId() {
        return userId;
    }

    public int getPosts() {
        return posts;
    }

    public char getSex() {
        return sex;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
            return Period.between(birthDate, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", posts=" + posts +
                ", sex=" + sex +
                ", userName='" + userName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}