package it.campe;

public class Main {

    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount);

        System.out.println(hugeAmount);
    }
}
