package com.jw.firstapp;

import com.jw.firstapp.java_base.GenericClass;

import org.junit.Test;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import designPattern.Father;
import designPattern.Son;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);

        GenericClass<Integer> genericClass = new GenericClass<>();
//        Object o  = genericClass.getT();
        genericClass.checkT();
    }

//    @Test
//    public void testLsp(){
//        HashMap h = new HashMap();
//        Father f = new Father();
//        f.fun(h);
//
//        Son s = new Son();
//        s.fun(h);
//    }
    enum Student{XM,XH,XK}
    enum Teacher{WLS,LLS,QLS}

    @Test
    public void testEnum(){

        for (Student s:Student.values()){
            System.out.println(s+",ordinal:"+s.ordinal());
        }

        for (ErrorCode code:ErrorCode.values()){
            System.out.println(code.getCode()+",desc:"+code.getDesc());
        }

        System.out.println(getSignalDesc(Signal.RED));
        System.out.println(getSignalDesc(Signal.YELLOW));

        System.out.println("周一工作10小时（每小时50元）的工资："+SalaryEnum.MONDAY.pay(10,50));

        System.out.println("Student.XH.compareTo(Student.XK):"+Student.XH.compareTo(Student.XK));

        EnumSet<ErrorCode> errorCodeEnumSet = EnumSet.allOf(ErrorCode.class);
        for (ErrorCode code:errorCodeEnumSet){
            System.out.println("code:"+code.getCode()+",desc:"+code.getDesc());
        }

        EnumMap<Student,String> studentStringEnumMap = new EnumMap<>(Student.class);
        studentStringEnumMap.put(Student.XM,"小明");
        studentStringEnumMap.put(Student.XH,"小红");
        studentStringEnumMap.put(Student.XK,"小凯");
        for (Iterator<Map.Entry<Student,String>> iterator=studentStringEnumMap.entrySet().iterator();iterator.hasNext();){
            Map.Entry<Student,String> entry = iterator.next();
            System.out.println("name:"+entry.getKey().name()+",value:"+entry.getValue());
        }

    }

    /**
     * 枚举中定义构造方法和普通方法
     */
    enum ErrorCode{
        Ok(0,"成功"),
        Nok(1,"失败"),
        ErrorA(404,"网页走丢了");

        private int code;
        private String desc;

        ErrorCode(int code,String desc){
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }


    /**
     * 枚举可以实现接口
     */


    /**
     * 枚举不能继承和被继承
     */


    /**
     * switch状态机
     */
    enum Signal{GREEN,RED,YELLOW}

    private String getSignalDesc(Signal signal){
        switch (signal){
            case RED:
                return "红灯停";
            case GREEN:
                return "绿灯行";
            case YELLOW:
                return "黄灯尽快通行";
        }
        return null;
    }


    /**
     * 枚举策略
     */
    enum SalaryEnum{
        MONDAY(PayType.WEEKDAY), TUESDAY(PayType.WEEKDAY), WEDNESDAY(
                PayType.WEEKDAY), THURSDAY(PayType.WEEKDAY), FRIDAY(PayType.WEEKDAY), SATURDAY(
                PayType.WEEKEND), SUNDAY(PayType.WEEKEND);

        // 构造方法：enum的构造方法只能被声明为private权限或不声明权限
        SalaryEnum(PayType payType){
            this.payType = payType;
        }

        private PayType payType;

        double pay(double hoursWorked,double payRate){
            return payType.pay(hoursWorked,payRate);
        }

        enum PayType{
            WEEKDAY{
                @Override
                double overtimePay(double hours, double payRate) {
                    return hours <= HOURS_PER_SHIFT ? 0 : (hours - HOURS_PER_SHIFT)
                            * payRate / 2;
                }
            },
            WEEKEND{
                @Override
                double overtimePay(double hours, double payRate) {
                    return hours * payRate / 2;
                }
            };

            private static final int HOURS_PER_SHIFT = 8;

            abstract double overtimePay(double hours,double payRate);

            double pay(double hoursWorked,double payRate){
                double basePay = hoursWorked * payRate;
                return basePay + overtimePay(hoursWorked, payRate);
            }
        }

    }










}