import project.Root;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
    public static List<Root> regionsWhereTheMostInvested(List<Root> list, int countOfRegions) {
        return list.stream()
                .sorted(Comparator.comparing(Root::getLendprojectcost).reversed())
                .limit(countOfRegions)
                .collect(Collectors.toList());
    }

    public static List<Root> regionsWithTheMostProjects(List<Root> list, int countOfRegions) {
        return list.stream()
                .filter(r -> r.getProjectdocs() != null)
                .sorted(((o1, o2) -> o2.getProjectdocs().size() - o1.getProjectdocs().size()))
                .limit(countOfRegions)
                .collect(Collectors.toList());
    }
}
