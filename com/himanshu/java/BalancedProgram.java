package com.himanshu.java;

public class BalancedProgram {
    public static void main(String[] args) {
        System.out.println("hello world");
        String input = "{()}[]";
        if (isBalanced(input)) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }

    private static boolean isBalanced(String input) {
        int i = -1;
        char[] stack = new char[input.length()];
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++i] = ch;
            } else {
                if (i >= 0 && (((stack[i]) == '(' && ch == ')')
                        || ((stack[i]) == '[' && ch == ']')
                        || ((stack[i]) == '{' && ch == '}'))) {
                    i--;
                } else
                    return false;
            }
        }
        return i == -1;
    }
}