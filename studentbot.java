public class StudentBot extends ChatBot{

    public StudentBot(String name){
        super(name); //triggers the name method in ChatBot
    }

    public String respondToGreeting(String greeting){
        String response = "";
        if (statement.indexOf("morning") >= 0)
        {
            response = "Good morning";
        }
        else if (statement.indexOf("afternoon") >= 0)
        {
            response = "Good afternoon";
        }
        else {
            response = "Hello";
        }
        return response;
    }
}