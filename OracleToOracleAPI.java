/**
 * Created by pierrerubier on 20/11/2014.
 */
public class OracleToOracleAPI {
    private String oracle;
    private String oracleAPI;

    public OracleToOracleAPI() {
    }

    public String getOracleAPI(String oracleRequest) {
        oracle = oracleRequest;
        oracleAPI = oracle.replace("'", "''");
        oracleAPI = oracleAPI.replace("(57,156,453)", "('||LISTID||')");
        return oracleAPI;
    }
}
