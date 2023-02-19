public enum Type {
    WORK("Рабочие задачи"),
    PERSONAL("Личные задачи");

    private final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    @Override
    public String toString(){
        return type;
    }

}
