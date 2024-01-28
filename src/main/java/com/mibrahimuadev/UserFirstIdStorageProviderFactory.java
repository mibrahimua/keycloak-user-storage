package com.mibrahimuadev;


import org.jboss.logging.Logger;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;

public class UserFirstIdStorageProviderFactory implements UserStorageProviderFactory<UserFirstIdStorageProvider> {
    public static final String PROVIDER_ID = "First ID providers";

    private static final Logger logger = Logger.getLogger(UserFirstIdStorageProviderFactory.class);
    @Override
    public UserFirstIdStorageProvider create(KeycloakSession session, ComponentModel model) {
        return new UserFirstIdStorageProvider(session, model);
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }

    @Override
    public String getHelpText() {
        return "JPA Example User Storage Provider";
    }

    @Override
    public void close() {
        logger.info("<<<<<< Closing factory");

    }
}
