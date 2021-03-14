package model;

public class Lamp {
    static boolean isShining;

    public static boolean light(boolean isOn){
        if (isOn) {
            System.out.println("Фонарь светит");
            isShining = true;
        } else if (!(isOn)) {
            System.out.println("Фонарь выключен");
            isShining = false;

        }
        return isShining;
    }
}
