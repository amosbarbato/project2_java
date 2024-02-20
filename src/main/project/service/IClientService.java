package main.project.service;

import main.project.main.Client;

public interface IClientService {
    Boolean toSave (Client client);
    Client toFindFromCode (Long CodeReg);

    void toDelete (Long CodeReg);
    void toChange (Client client);
}
