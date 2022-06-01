import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import project.Root;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class Reader {
    public static List<Root> buildList(String fileName) {
        List<Root> dataList = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                dataList.add(objectMapper.readValue(line, Root.class));
            }
        } catch (IOException e) {
            log.error(String.format("File %s was not found - %S", fileName, e));
            System.exit(1);
        }
        return dataList;
    }
}
