package model;

public class Tunnel {
    static String destination;


    public static String checkLocation(double xCoordinate, double yCoordinate){
        if ((xCoordinate < 0 && yCoordinate < 0) || (xCoordinate < 0 && yCoordinate > 0)) {
            destination = "left";
        } else if ((xCoordinate > 0 && yCoordinate > 0) || (xCoordinate > 0 && yCoordinate < 0)) {
            destination = "right";
        } else if (xCoordinate == 0 && yCoordinate == 0) {
            destination = "zero";
        } else if (xCoordinate == 0 && yCoordinate != 0) {
            destination = "OY";
        } else if (xCoordinate != 0 && yCoordinate == 0 ) {
            destination = "OX";
        } else {
            throw new NumberFormatException("Невозможно определить локацию");
        }
        return destination;

    }
}
