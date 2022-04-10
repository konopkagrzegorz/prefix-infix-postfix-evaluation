package com.epam.jap;

public class PostfixEvaluation implements Evaluation {

    private String value;
    private int result;

    public PostfixEvaluation(String value) {
        this.value = value;
    }

    @Override
    public int evaluate() {

        for (int i = 0; i < value.length(); i++) {

        }
        return 0;
    }
}
