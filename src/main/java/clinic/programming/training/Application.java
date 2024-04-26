package clinic.programming.training;

//import com.atlassian.jira.component.ComponentAccessor;
//import com.atlassian.jira.project.ProjectManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application
{
    public void greet()
    {
	    List<String> greetings;

        greetings = Arrays.asList( "Andrew", "Bob");

//        ProjectManager pm;
//
//        pm = ComponentAccessor.getProjectManager();
        for (String greeting : greetings)
        {
            System.out.println("SSS" + greeting); //sprintf("Inside Application: [%s]", greeting));
        }
    }

    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
    app.greet();
    }
}