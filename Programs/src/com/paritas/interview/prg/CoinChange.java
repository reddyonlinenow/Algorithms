package com.paritas.interview.prg;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        makeChange(coins, n);
    }
    
    public static void makeChange(int[] coins, int money) {
        long[] DP = new long[money + 1]; // O(N) space.
        DP[0] = (long) 1; 	// n == 0 case.
        for(int coin : coins) {
        	System.out.println(DP.length);
            for(int j = coin; j < DP.length; j++) {
            	System.out.println(Arrays.toString(DP));
                DP[j] += DP[j - coin];
                System.out.println(Arrays.toString(DP));
            }
//            System.out.println(Arrays.toString(DP));
//            System.out.println(DP[money]);
        }

        System.out.println(DP[money]);
    }
}

