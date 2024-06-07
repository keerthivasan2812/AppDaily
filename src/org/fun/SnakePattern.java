package org.fun;

public class SnakePattern {
	
	public static void printSnakePattern(int N) {
        int currentNum = 1;
        
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                // Print left to right
                for (int j = 0; j < N; j++) {
                    System.out.print(currentNum + "\t");
                    currentNum++;
                }
            } else {
                // Print right to left
                int start = currentNum + N - 1;
                for (int j = 0; j < N; j++) {
                    System.out.print(start + "\t");
                    start--;
                }
                currentNum += N;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int N = 3;  // Example input
        printSnakePattern(N);
    }

}
