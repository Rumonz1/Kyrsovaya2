public class IncorrectArgumentException extends Exception{
    private String argument;

    public String getArgument() {
        return argument;
    }
    public IncorrectArgumentException(String argument){
        super(argument);
    }
    @Override
    public String toString()
    {
        return "Неправильно введён параметр: "+super.getMessage() +" "+ argument;
    }
}
