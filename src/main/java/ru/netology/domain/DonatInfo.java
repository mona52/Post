package ru.netology.domain;

public class DonatInfo {
    private boolean isDonut;
    private int paidDuration;
    private PlaceHolder placeHolder; //заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи
    private boolean canPublishFreeCopy;
    private String editMode;

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public PlaceHolder getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(PlaceHolder placeHolder) {
        this.placeHolder = placeHolder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
