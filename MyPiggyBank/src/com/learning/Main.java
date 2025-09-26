package com.learning;

public class Main {
    public static void main(String[] args) {
        // สร้างกระปุกใบแรก : สร้าง Object จาก Class PiggyBank โดยตั้งชื่อเจ้าของว่า "น้องพอใจ"
        PiggyBank piggyBank = new PiggyBank("น้องพอใจ");

        // ดูเงินครั้งแรก : เรียกใช้เมธอด showMoney() ของ "น้องพอใจ" เพื่อดูจำนวนแรก (ควรจะเป็น 0)
        piggyBank.showMoney();

        // หยอดเงิน : เรียกใช้เมธอด addMoney() 2-3 ครั้ง เพื่อหยอดเงินใส่กระปุก (เช่น หยอด 20 บาท, หยอด 50 บาท)
        piggyBank.addMoney(20);
        piggyBank.addMoney(50);

        // ดูเงินอีกครั้ง : เรียกใช้เมธอด showMoney() อีกครั้ง เพื่อดูยอดเงินล่าสุดหลังจากหยอดเงินไปแล้ว
        piggyBank.showMoney();
    }
}