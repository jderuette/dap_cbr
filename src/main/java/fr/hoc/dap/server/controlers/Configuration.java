package fr.hoc.dap.server.controlers;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * The configuration programme implements a web application
 * that displays mails & events from an user account on google.
 * it could add new user too !
 * You could find details of each user's account by admin controler
 * display on your browser.
 * @author house_Mecrob
 * @version 1.0
 * @since 2019-01-21
 */
public class Configuration {

    /**
     * @param indicate app name.
     * @param JsonFactory neede to be treat. If value = null <code>null</code> an exception occur.
     * @param TOKENS_DIRECTORY_PATH indicate where to stock tokens.
     **/
    protected static final String APPLICATION_NAME = "House Of Code *}";

    /** @param ma porte d'entrée pour autorisation */
    private static final String CREDENTIALS_FILE_PATH = System.getProperty("user.home") + "/dap/credentials_web.json";
    /**
     * TOKENS_DIRECTORY_PATH oups.
     */
    private static final String TOKENS_DIRECTORY_PATH = System.getProperty("user.home") + "/dap/tokens";

    /**
     * Global instance of the scopes required by this quickstart.
     * If modifying these scopes, delete your previously saved tokens/ folder.
     *(Variable).*/
    private static String applicationName;
    /**
     * variable .
     */
    private static String credentialsFilePath;
    /**
     * variable .
     */
    private static String tokensDirectoryPath;

    /**
     * Config initialization.
     */
    @Autowired
    public Configuration() {
        init();
    }

    /**
     * Initialize config, add all values needed.
     */
    private void init() {
        Configuration.applicationName = APPLICATION_NAME;
        Configuration.credentialsFilePath = CREDENTIALS_FILE_PATH;
        Configuration.tokensDirectoryPath = TOKENS_DIRECTORY_PATH;
    }

    /**
     * @return the name of the app choosen in config.
     */
    public String getApplicationName() {

        return applicationName;

    }

    /**
     * @param newApplicationName the applicationName to set, or needed to be changed.
     */
    public void setApplicationName(final String newApplicationName) {
        Configuration.applicationName = newApplicationName;
    }

    /**
     * @return  A JSON Object needed.
     */
    public String getCredentialsFilePath() {
        return credentialsFilePath;
    }

    /**
     * @param newCredentialsFilePath set a new JSON Object needed.
     */
    public void setCredentialsFilePath(final String newCredentialsFilePath) {
        Configuration.credentialsFilePath = newCredentialsFilePath;
    }

    /**
     * @return tokens.
     */
    public String getTokensDirectoryPath() {
        return tokensDirectoryPath;
    }

    /**
     * @param newTokensDirectoryPath new tokens.
     */
    public void setTokensDirectoryPath(final String newTokensDirectoryPath) {
        Configuration.tokensDirectoryPath = newTokensDirectoryPath;
    }

    /***
     * .
     * @return the authorization callback from an OAuth 2 service provider.
     */
    public String getoAuth2CallbackUrl() {
        return "/oAuth2Callback";
    }
}
