package com.vl.training.sample;
public class Prime {
    public static void main(final String[] args) {
        int[] k = new int[args.length];
        int num1, num2;
        Prime p = new Prime();
        for (int i = 0; i < args.length; i++) {
            k[i] = Integer.parseInt(args[i]);
        }
        num1 = k[0];
        num2 = k[1];
        boolean b = p.validate(num1, num2);
        if (b) {
            System.out.println("a is prime and b is prime and a-b =2");
        }
        else {
            System.out.println("Condition false");
        }
    }
    final boolean validate(final int p1, final int p2) {
        int count = 0, count1 = 0;
        boolean ret = false;
        for (int i = 1; i <= p1; i++) {
            if (p1 % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            for (int i = 1; i <= p2; i++) {
                if (p2 % i == 0) {
                    count1++;
                }
            }
            if (count == 2 && count1 == 2) {
                if ((p1 - p2) == 2 || (p2 - p1) == 2) {
                    ret = true;
                }
                else {
                    ret = false;
                }
            }
            return ret;
        }
        else {
            return false;
        }
    }
}
