package model;

public class Walls {
    private static boolean isCold;

    public static boolean checkWallsCharacteristics(double temperature, String material, String smell){
        if (temperature <= 0) {
            isCold = true;
            System.out.println("Стены холодные");
        } else if (temperature > 0) {
            isCold = false;
            System.out.println("Стены теплые");
        } else {
            throw new IllegalArgumentException("Некорректное значение темпераотуры");
        }
        System.out.println("Стены из" + ' ' + material + ' ' + smell);
        return isCold;
    }
}
