package com.jw.firstapp.retrofit;

public class TestSetting {

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "TestSetting{" +
                "language='" + language + '\'' +
                '}';
    }
}
