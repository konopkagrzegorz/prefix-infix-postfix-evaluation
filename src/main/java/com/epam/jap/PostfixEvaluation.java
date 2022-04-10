package com.epam.jap;

import java.util.LinkedList;

public class PostfixEvaluation implements Evaluation {

    private String value;
    private int result;

    public PostfixEvaluation(String value) {
        this.value = value;
    }

    @Override
    public int evaluate() {

        LinkedList<Character> stack = new LinkedList<>();
        int result = 0;

        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i)))
                stack.push(value.charAt(i));
            else {
                if (Character.isDigit(value.charAt(i)))
                    stack.push(value.charAt(i));
                else {
                    char operator = value.charAt(i);

                    switch (operator) {
                        case '+':
                            int value1 = stack.pop();
                            int value2 = stack.pop();
                            result += value1 + value2;
                    }
                }
            }
        }
        return 0;
    }
}
