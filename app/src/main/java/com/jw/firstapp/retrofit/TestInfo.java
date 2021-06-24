package com.jw.firstapp.retrofit;

public class TestInfo {

    private int id;
    private String name;
    private TestSetting testSetting;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestSetting getTestSetting() {
        return testSetting;
    }

    public void setTestSetting(TestSetting testSetting) {
        this.testSetting = testSetting;
    }

    @Override
    public String toString() {
        return "TestInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", testSetting=" + testSetting +
                '}';
    }
}
