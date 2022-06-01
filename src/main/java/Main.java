import project.Root;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Root> dataList = Reader.buildList(Configuration.DATA_FILENAME);

        List<Root> regionsWhereTheMostInvested = Service.regionsWhereTheMostInvested(dataList, 10);
        System.out.println("The most invested");
        for (Root root : regionsWhereTheMostInvested) {
            System.out.println(root.getRegionname() + " cost: " + root.getLendprojectcost());
        }

        List<Root> regionsWithTheMostProjects = Service.regionsWithTheMostProjects(dataList, 10);
        System.out.println("The most projects ");
        for (Root root : regionsWithTheMostProjects) {
            System.out.println(root.getRegionname() + " projects: " + root.getProjectdocs().size());
        }
    }
}
