package scott.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application{
    
    public int countWords(String words){
        String[] separateWords = StringUtils.split(words, ' ');
        return (separateWords == null) ? 0 : separateWords.length;
    }
    
    public void greet(){
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        for (String greeting:greetings){
            System.out.println("Greeting: "+greeting);
        }
    }
    public Application(){
        System.out.println("Inside Application");
    }
    
    //method main(): ALWAYS the APPLICATION entry point
    public static void main(String[] args){
        System.out.println("Starting Application");
        Application app = new Application();
        app.greet();
        int count = app.countWords("“Data-driven” startups are the wildcatters of the new economy: they prospect for digital oil, extract it and turn it into clever new services, from analysing X-rays and CAT scans to determining where to spray herbicide on a field.");
        System.out.println("Word Count: " + count);
    }
}
