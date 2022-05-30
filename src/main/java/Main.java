import com.fasterxml.jackson.databind.ObjectMapper;
import project.Root;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Root> dataList = buildList();

        System.out.println("The most projects ");
        regionsWithTheMostProjects(dataList, 10);

        System.out.println("The most invested");
        regionsWhereTheMostInvested(dataList, 10);
    }

    public static void regionsWhereTheMostInvested(List<Root> list, int countOfRegions) {
        list.stream()
                .sorted(((o1, o2) -> (int) (o2.lendprojectcost - o1.lendprojectcost)))
                .limit(countOfRegions)
                .forEach(root -> System.out.println(root.regionname + " cost: " + root.lendprojectcost));
    }

    public static void regionsWithTheMostProjects(List<Root> list, int countOfRegions) {
        list.stream()
                .filter(r -> r.projectdocs != null)
                .sorted(((o1, o2) -> o2.projectdocs.size() - o1.projectdocs.size()))
                .limit(countOfRegions)
                .forEach(root -> System.out.println(root.regionname + " projects: " + root.projectdocs.size()));
    }

    public static List<Root> buildList() {
        List<Root> dataList = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        String data = "world_bank.json";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(data))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                dataList.add(objectMapper.readValue(line, Root.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataList;
    }

}
