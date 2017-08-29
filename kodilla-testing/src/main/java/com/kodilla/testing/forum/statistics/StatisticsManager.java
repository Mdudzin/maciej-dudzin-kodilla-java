package com.kodilla.testing.forum.statistics;

public class StatisticsManager {

    private Statistics statistics;
    private int userQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double postPerUser;
    private double commentPerUser;
    private double commentPerPost;

    public StatisticsManager(Statistics statistics) {

        this.statistics = statistics;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentPerUser() {
        return commentPerUser;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        int userQuantity = statistics.usersNames().size();
        int postsQuantity = statistics.postsCount();
        int commentsQuantity = statistics.commentsCount();
        double postPerUser = postsQuantity / userQuantity;
        double commentPerUser = commentsQuantity / userQuantity;
        double commentPerPost = commentsQuantity / postsQuantity;

    }

    public void ShowStatistics() {

        System.out.println(userQuantity);
        System.out.println(postsQuantity);
        System.out.println(commentsQuantity);
        System.out.println(postPerUser);
        System.out.println(commentPerUser);
        System.out.println(commentPerPost);

    }
}
