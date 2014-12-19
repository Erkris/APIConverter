/**
 * Created by pierrerubier on 20/11/2014.
 */
public class OracleAPIToOracle {
    private String oracleAPI;
    private String oracle;

    public OracleAPIToOracle() {
    }

    public String getOracle(String apiOracle) {
        oracleAPI = apiOracle;
        oracle = oracleAPI.replace("''", "'");
        oracle = oracle.replace("('||LISTID||')", "(57,156,453)");
        return oracle;
    }
}
