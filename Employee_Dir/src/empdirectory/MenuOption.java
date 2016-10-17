package empdirectory;

/**
 * Created by arvindhn602 on 16/10/16.
 */
public enum MenuOption {
    ADD_EMP(1),
    REMOVE_EMP(2),
    END(3);

    private final int value;

    MenuOption (int choice) {
        value = choice;
    }

    public int getValue(){
        return value;
    }
}
