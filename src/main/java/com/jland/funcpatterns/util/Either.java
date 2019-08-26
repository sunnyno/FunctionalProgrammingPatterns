package com.jland.funcpatterns.util;

import java.util.function.Function;

public class Either<R> {
    private R right;
    private Exception left;

    public Either(R right, Exception left) {
        this.right = right;
        this.left = left;
    }

    public static <R, L> Either<R> right(R value) {
        return new Either<>(value, null);
    }

    public static <R, L> Either<R> left(Exception value) {
        return new Either<>(null, value);
    }

    public static <T, R> Function<T, Either<R>> lift(CheckedFunction<T, R> checkedFunction) {
        return t -> {
            try {
                return Either.right(checkedFunction.apply(t));
            } catch (Exception e) {
                return Either.left(e);
            }
        };
    }

    @Override
    public String toString() {
        return "Either{" +
                (right != null ? "right=" + right : "left=" + left) +
                '}';
    }
}
