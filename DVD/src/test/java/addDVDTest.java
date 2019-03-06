import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class addDVDTest {

    @Test
    public void addDVDList() {

        List dvdList = new ArrayList();
        List dvdList2 = new ArrayList();
        DVD Speed = new DVD("Speed", "Action");
        dvdList.add(Speed);
        dvdList2.add(Speed);

        Assert.assertEquals(dvdList,dvdList2);
    }
}