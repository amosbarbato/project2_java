package dao.test;

import main.project.dao.IClientDAO;
import main.project.main.Client;

public class ClientDAOMock implements IClientDAO {
    @Override
    public Boolean toSave(Client client) {
        return true;
    }

    @Override
    public Client toFindFromCode(Long CodeReg) {
        Client client = new Client();
        client.setCodeReg(CodeReg);
        return client;
    }

    @Override
    public void toDelete(Long CodeReg) {

    }

    @Override
    public void toChange(Client client) {

    }
}
