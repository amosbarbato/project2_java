package main.project.dao;

import main.project.main.Client;

public interface IClientDAO {
    Boolean toSave (Client client);
    Client toFindFromCode (Long CodeReg);

    void toDelete (Long CodeReg);
    void toChange (Client client);
}
