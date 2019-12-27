package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student Pun = new Student();
        Pun.name = "นายปัญจพล อ่อนโคทา";
        Pun.id = "623410006-2";
        Pun.major = "วิทยาการคอมพิวเตอร์และสารสนเทศ";

        System.out.println("1.ชื่อ " + Pun.name);
        System.out.println("2.รหัสนักศึกษา " + Pun.id);
        System.out.println("3.สาขา " + Pun.major);


        
    }
}
