package ru.netology.sqr;

public class SQRService {
    public int calculate(int minimal, int maximal) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minimal) {
                if (i * i <= maximal) {
                    count++;
                }
            }
        }
        return count;
    }
}