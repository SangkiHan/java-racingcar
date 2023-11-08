package me.namuhuchutong.racingcar.domain;

import java.util.List;

public class CarNames {

    private static final int LIMIT_NAME_LENGTH = 5;

    private final List<String> names;

    public static CarNames from(List<String> names) {
        return new CarNames(names);
    }

    private CarNames(List<String> names) {
        validateNameLength(names);
        this.names = names;
    }

    private void validateNameLength(List<String> names) {
        if (names.stream().anyMatch(name -> name.length() > LIMIT_NAME_LENGTH)) {
            throw new IllegalArgumentException("이름은 5자를 넘길 수 없습니다.");
        }
    }

    // 3차 피드백 반영
    public List<String> getNames() {
        return names;
    }

    public int getNumberOfNames() {
        return this.names.size();
    }
}