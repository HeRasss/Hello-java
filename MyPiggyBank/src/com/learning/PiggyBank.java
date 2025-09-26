package com.learning;

public class PiggyBank {
    // Fields (ตัวแปรของคลาส)
    private String ownerName; // ชื่อเจ้าของกระปุกออมสิน
    private double money;     // จำนวนเงินในกระปุกออมสิน (หน่วยเป็นบาท)

    // Constructor
    public PiggyBank(String ownerName) {
        this.ownerName = ownerName;
        this.money = 0.0; // กระปุกใหม่เริ่มต้นไม่มีเงิน
    }

    // Methods
    public void addMoney(double amount) {
        this.money += amount; // เพิ่มเงินเข้าไปในกระปุก
        System.out.println("หยอดเงินใส่กระปุกของ " + ownerName + " จำนวน " + amount + " บาท");
    }

    public void showMoney() {
        System.out.println("กระปุกของ " + ownerName + " มีเงินทั้งหมด " + money + " บาท");
    }
}