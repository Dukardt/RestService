package ru.netology.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int balance = 0;
        int count = 0;

        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                balance -= expenses;
                balance /= 3;
                count++;
            } else {
                balance += income;
                balance -= expenses;
            }
        }
        return count;
    }
}
