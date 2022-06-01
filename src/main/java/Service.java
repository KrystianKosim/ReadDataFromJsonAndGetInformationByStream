import project.Root;

import java.util.List;
import java.util.stream.Collectors;

public class Service {
    public static List<Root> regionsWhereTheMostInvested(List<Root> list, int countOfRegions) {
        return list.stream()
                .sorted(((o1, o2) -> (int) (o2.lendprojectcost - o1.lendprojectcost)))
                .limit(countOfRegions)
                .collect(Collectors.toList());
    }

    public static List<Root> regionsWithTheMostProjects(List<Root> list, int countOfRegions) {
        return list.stream()
                .filter(r -> r.projectdocs != null)
                .sorted(((o1, o2) -> o2.projectdocs.size() - o1.projectdocs.size()))
                .limit(countOfRegions)
                .collect(Collectors.toList());
    }
}
