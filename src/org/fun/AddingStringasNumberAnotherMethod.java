package org.fun;

public class AddingStringasNumberAnotherMethod {
	
	
	
	
	
	
	
	public static void main(String[] args) {
        String n = "12";
        String b = "45";

        String result = addStrings(n, b);

        System.out.println(result);
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int total = digit1 + digit2 + carry;
            sum.insert(0, total % 10);
            carry = total / 10;
        }

        return sum.toString();
    }

}
