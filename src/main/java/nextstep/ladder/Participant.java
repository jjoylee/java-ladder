package nextstep.ladder;

public class Participant {
    private static final int NAME_MAX_LENGTH = 5;
    private String name;

    public Participant(String name) {
        if (!validation(name)) {
            throw new IllegalArgumentException("이름은 최대 5글자까지만 사용가능합니다.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private boolean validation(String name) {
        if (name.length() > NAME_MAX_LENGTH) {
            return false; //Error
        }
        return true;
    }
}