package dao.test;

import main.project.dao.IClientDAO;
import main.project.main.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientDAOTests {
    private IClientDAO clientDAO;
    private Client client;
    public ClientDAOTests() {
        clientDAO = new ClientDAOMock();
    }

    @Before
    public void init() {
        client = new Client();
        client.setCodeReg(1234567891L);
        client.setName("Gabriel");
        client.setNumberAdress(979);
        client.setPhone(97997979797L);
        client.setAdress("Rua Nova");
        client.setCity("Manaus");
        client.setUf("AM");
        clientDAO.toSave(client);
    }

    @Test
    public void toSearchClient() {
        Client clientConsulted = clientDAO.toFindFromCode(client.getCodeReg());
        Assert.assertNotNull(clientConsulted);
    }

    @Test
    public void toSaveClient() {
        Boolean retorno = clientDAO.toSave(client);
        Assert.assertTrue(retorno);
    }

    @Test
    public void toDeleteClient() {
        clientDAO.toDelete(client.getCodeReg());
    }

    @Test
    public void toChangeClient() {
        client.setName("F Gabriel");
        clientDAO.toChange(client);
        Assert.assertEquals("F Gabriel", client.getName());
    }
}