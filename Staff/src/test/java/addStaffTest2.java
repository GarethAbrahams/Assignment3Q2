import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class addStaffTest2 {

    @Test
    public void addStaffList() {
            List StaffList = new ArrayList();
            List StaffList2 = new ArrayList();
            Staff Gareth = new Staff("Gareth", "Abrahams","123456","IT");
            StaffList.add(Gareth);
            StaffList2.add(Gareth);

            Assert.assertEquals(StaffList,StaffList2);


    }
}