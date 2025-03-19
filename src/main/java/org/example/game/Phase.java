package org.example.game;

public enum Phase {
    SETUP,
    NIGHT,
    DAY,
    END;

    public Phase next() {
        return switch (this) {
            case NIGHT -> DAY;
            case DAY -> NIGHT;
            default -> throw new IllegalStateException("Impossible de passer à la phase suivante.");
        };
    }

    public Phase start() {
        return switch (this) {
            case SETUP -> NIGHT;
            default -> throw new IllegalStateException("Impossible de démarrer la partie.");
        };
    }

    public Phase end() {
        return switch (this) {
            case NIGHT, DAY -> END;
            default -> throw new IllegalStateException("Impossible de terminer la partie.");
        };
    }
}
