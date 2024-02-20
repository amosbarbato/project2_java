package main.project.dao;

import main.project.main.Client;

public class ClientDAO implements IClientDAO {
    @Override
    public Boolean toSave(Client client) {
        return true;
    }

    @Override
    public Client toFindFromCode(Long CodeReg) {
        return null;
    }

    @Override
    public void toDelete(Long CodeReg) {

    }

    @Override
    public void toChange(Client client) {

    }
}
