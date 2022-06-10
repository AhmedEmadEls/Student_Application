package com.example.student_application.model;

import java.util.Date;

public class ChatModel {

    String message;
    String user_name;
    Date timestamp;
    String messageID;
    String user_image_url;
    String name;

    public ChatModel() {
    }

    public ChatModel(String message, String user_name, Date timestamp, String messageID, String user_image_url, String name) {
        this.message = message;
        this.user_name = user_name;
        this.timestamp = timestamp;
        this.messageID = messageID;
        this.user_image_url = user_image_url;
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getUser_image_url() {
        return user_image_url;
    }

    public void setUser_image_url(String user_image_url) {
        this.user_image_url = user_image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
