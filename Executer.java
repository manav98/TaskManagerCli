import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Executer {
    public static void main(String[] args) throws IOException{
        String operation = args[0];
        File tasksFile = new File("tasks.json");
        boolean isFileNew = tasksFile.createNewFile();
        // FileWriter fileWriter = new FileWriter("tasks.json");
        switch (operation) {
            case "add": {
                if(isFileNew)
                {

                }
                System.out.println("Task Added");
            }
                break;
            case "update": {
                System.out.println("Task Added");
            }
                break;
            case "delete": {
                System.out.println("Task Added");
            }
                break;
            case "mark-in-progress": {
                System.out.println("Task Added");
            }
                break;
            case "mark-done": {
                System.out.println("Task Added");
            }
                break;

            default:
                break;
        }
    }
}
