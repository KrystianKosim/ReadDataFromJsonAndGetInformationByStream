import org.junit.Assert;
import org.junit.jupiter.api.Test;
import project.Root;

import java.util.LinkedList;
import java.util.List;

class ServiceTest {

    @Test
    void regionsWhereTheMostInvested() {
        List<Root> data = Reader.buildList(Configuration.DATA_FILENAME);
        List<Root> shouldReturn = new LinkedList<>();

        shouldReturn.add(data.get(476));
        shouldReturn.add(data.get(277));
        shouldReturn.add(data.get(101));
        shouldReturn.add(data.get(287));
        shouldReturn.add(data.get(65));
        shouldReturn.add(data.get(449));
        shouldReturn.add(data.get(369));
        shouldReturn.add(data.get(429));
        shouldReturn.add(data.get(6));
        shouldReturn.add(data.get(196));

        List<Root> result = Service.regionsWithTheMostProjects(data, 10);
        Assert.assertEquals(shouldReturn, result);
    }

    @Test
    void regionsWithTheMostProjects() {
        List<Root> data = Reader.buildList(Configuration.DATA_FILENAME);
        List<Root> shouldReturn = new LinkedList<>();

        shouldReturn.add(data.get(192));
        shouldReturn.add(data.get(77));
        shouldReturn.add(data.get(211));
        shouldReturn.add(data.get(267));
        shouldReturn.add(data.get(129));
        shouldReturn.add(data.get(6));
        shouldReturn.add(data.get(163));
        shouldReturn.add(data.get(407));
        shouldReturn.add(data.get(187));
        shouldReturn.add(data.get(258));

        List<Root> result = Service.regionsWhereTheMostInvested(data, 10);

        Assert.assertEquals(shouldReturn, result);
    }
}