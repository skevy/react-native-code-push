package com.microsoft.codepush.react;

public enum CodePushInstallMode {
    IMMEDIATE(0),
    ON_NEXT_RESTART(1),
    ON_NEXT_RESUME(2);

    private final int value;
    private CodePushInstallMode(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}