package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canUserPost;
    private boolean canGroupsPost;
    private boolean canUserOpen;
    private boolean canUserClose;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanUserPost() {
        return canUserPost;
    }

    public void setCanUserPost(boolean canUserPost) {
        this.canUserPost = canUserPost;
    }

    public boolean isCanGroupsPost() {
        return canGroupsPost;
    }

    public void setCanGroupsPost(boolean canGroupsPost) {
        this.canGroupsPost = canGroupsPost;
    }

    public boolean isCanUserOpen() {
        return canUserOpen;
    }

    public void setCanUserOpen(boolean canUserOpen) {
        this.canUserOpen = canUserOpen;
    }

    public boolean isCanUserClose() {
        return canUserClose;
    }

    public void setCanUserClose(boolean canUserClose) {
        this.canUserClose = canUserClose;
    }

}
