package com.example.contacts;

public class Contacts {
    private int imageDrawable;
    private String contactName;
    private String contactEmail;
    private String contactPhone;

    public Contacts(int imageDrawable, String contactName, String contactEmail, String contactPhone){
        this.contactEmail = contactEmail;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.imageDrawable = imageDrawable;
    }

    public int getImageDrawable(){
        return imageDrawable;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
    }
}
