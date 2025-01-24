import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class test {
    public static void main(String[] args) throws IOException {
        // int id = 12;
        // String json = """
        // {
        // "id" : ${id},
        // "description" : "This is an object"
        // }
        // """;

        // FileWriter fileWriter = new FileWriter("tasks.json", true);
        // fileWriter.write(json);
        // fileWriter.close();

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
    }
}
