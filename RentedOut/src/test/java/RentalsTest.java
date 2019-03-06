import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RentalsTest {

    @Test
    public void addRentalList() {
        List RentalList = new ArrayList();
        List RentalList2 = new ArrayList();
        Rent Speed = new Rent("Gareth", "Speed","123456");
        RentalList.add(Speed);
        RentalList2.add(Speed);

        Assert.assertEquals(RentalList,RentalList2);
    }
}