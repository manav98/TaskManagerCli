import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class Executer {
    public static void main(String[] args) throws IOException {
        String operation = args[0];
        File tasksFile = new File("tasks.json");
        boolean isFileNew = tasksFile.createNewFile();
        switch (operation) {
            case "add": {
                if (isFileNew) {
                    Task addTask = new Task(1, args[1], "todo", new Timestamp(System.currentTimeMillis()),
                            new Timestamp(System.currentTimeMillis()));
                    String addTaskJsonObject = "{\"id\" : \"" + addTask.getId() + " \" "
                            + ",\"description\" : \"" + addTask.getDescription() + " \" "
                            + ",\"status\" : \"" + addTask.getStatus() + " \" "
                            + ",\"createdAt\" : \"" + addTask.getCreatedAt() + " \" "
                            + ",\"updatedAt\" : \"" + addTask.getUpdatedAt() + " \" }";
                    FileWriter fileWriter = new FileWriter("tasks.json", true);
                    fileWriter.write(addTaskJsonObject);
                    fileWriter.close();
                }
                else{
                    FileWriter fileWriter = new FileWriter("tasks.json", true);
                    FileReader fileReader = new FileReader("tasks.json");
                    
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
