package main.project.service;

import main.project.dao.IClientDAO;
import main.project.main.Client;

public class ClientService implements IClientService {
    private IClientDAO iClientDAO;

    public ClientService(IClientDAO iClientDAO) {
        this.iClientDAO = iClientDAO;
    }

    @Override
    public Boolean toSave(Client client) {
        return iClientDAO.toSave(client);
    }

    @Override
    public Client toFindFromCode(Long CodeReg) {
        return iClientDAO.toFindFromCode(CodeReg);
    }

    @Override
    public void toDelete(Long CodeReg) {
        iClientDAO.toDelete(CodeReg);
    }

    @Override
    public void toChange(Client client) {
        iClientDAO.toChange(client);
    }
}
