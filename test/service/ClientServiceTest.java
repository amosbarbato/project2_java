package service;

import dao.test.ClientDAOMock;
import main.project.dao.IClientDAO;
import main.project.main.Client;
import main.project.service.ClientService;
import main.project.service.IClientService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientServiceTest {
    private IClientService clientService;
    private Client client;
    public ClientServiceTest() {
        IClientDAO dao = new ClientDAOMock();
        clientService = new ClientService(dao);
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
    }

    @Test
    public void toSearchClient() {
        Client clientConsulted = clientService.toFindFromCode(client.getCodeReg());
        Assert.assertNotNull(clientConsulted);
    }

    @Test
    public void toSaveClient() {
        Boolean retorno = clientService.toSave(client);
        Assert.assertTrue(retorno);
    }

    @Test
    public void toDeleteClient() {
        clientService.toDelete(client.getCodeReg());
    }

    @Test
    public void toChangeClient() {
        client.setName("F Gabriel");
        clientService.toChange(client);
        Assert.assertEquals("F Gabriel", client.getName());
    }
}