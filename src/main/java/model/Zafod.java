package model;

public class Zafod {
    private static boolean ifGoFast;
    private static boolean isNervous;
    Lamp lamp = new Lamp();


    public static boolean goFast(int speed) {
        if (speed >= 50) {
            System.out.println("идёт быстро со скростью" + speed + "м/c");
            ifGoFast = true;
        } else if (speed > 0 && speed < 50) {
            System.out.println("идёт медленно со скростью" + speed + "м/c");
            ifGoFast = false;
        } else {
            throw new IllegalArgumentException("Некорректное значение скорости");
        }
        return ifGoFast;
    }

    public static boolean getNervous(boolean stress) {
        if (stress) {
            System.out.println("Зафод нервничает");
            isNervous = true;
        }
       else {
            System.out.println("Зафод не нервничает");
            isNervous = false;
        }
        return isNervous;
    }
}

