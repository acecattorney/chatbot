public class TeachersPet extends StudentBot{
    public TeachersPet(String botName){
        super(name);
    }
    private String respondToGreeting(string response){
        String beginning = super.respondToGreeting(response);
        int i - greeting.indexOf("name is");
        if (i > 0) 
            s += greeting.substring(i+7);
        else
            s += ".";
        s += "\nWhat are we going to do in class today?";
        return s;
    }
}