public class Main {
    public static void main(String[] args) {
        // สร้างตัวละคร
        Character warrior = new Warrior("Arthur");
        Character archer = new Archer("Legolas");

        // แสดงสถานะเริ่มต้นของตัวละคร
        warrior.showStatus();
        archer.showStatus();

        // สวมแหวนและรองเท้า
        Accessory ring = new Ring(15);  // เพิ่มพลังโจมตี 15
        Accessory boots = new Boots(5); // เพิ่มความเร็ว 5

        warrior.equipAccessory(ring);
        warrior.equipAccessory(boots);
        archer.equipAccessory(ring);
        archer.equipAccessory(boots);

        // แสดงสถานะหลังจากสวมอุปกรณ์
        System.out.println("\nAfter equipping accessories:");
        warrior.showStatus();
        archer.showStatus();

        // สวมอาวุธ
        warrior.equipWeapon();
        archer.equipWeapon();

        // แสดงสถานะหลังจากสวมอาวุธ
        System.out.println("\nAfter equipping weapons:");
        warrior.showStatus();
        archer.showStatus();
    }
}
