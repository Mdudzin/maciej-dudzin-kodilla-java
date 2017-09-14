package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum() {
        theUsersList.add(new ForumUser(1, "Dudzin", 120, 'M', 1985, 1,
                20));
        theUsersList.add(new ForumUser(2, "Grubby", 0, 'M', 1990, 2,
                15));
        theUsersList.add(new ForumUser(3, "Tracer", 340, 'F', 1995, 3,
                30));
        theUsersList.add(new ForumUser(4, "Diva", 500, 'F', 2000, 4,
                10));
        theUsersList.add(new ForumUser(5, "Joanna", 650, 'F', 1998, 5,
                5));
        theUsersList.add(new ForumUser(6, "Xan", 900, 'M', 1997, 6,
                1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUsersList);
    }
}