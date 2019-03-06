import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class addClientTest {

    @Test
    public void addClientList() {

        List ClientList = new ArrayList();
        List ClientList2 = new ArrayList();
        Client Gareth = new Client("Gareth", "Abrahams","123456");
        ClientList.add(Gareth);
        ClientList2.add(Gareth);

        Assert.assertEquals(ClientList,ClientList2);

    }
}