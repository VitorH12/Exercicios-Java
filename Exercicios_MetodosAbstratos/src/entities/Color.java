package entities;

public enum Color {
    BLACK("Black"),
    RED("Red"),
    BLUE("Blue");

    private final String displayName;


    Color(String displayName){
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }


}
