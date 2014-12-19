/**
 * Created by pierrerubier on 18/11/2014.
 */
public class OracleAPIToPGSQL {
    private String oracleAPI;
    private String pgSQLAPI;

    public OracleAPIToPGSQL() {
    }

    public String getPGSQLAPI(String apiOracle) {
        oracleAPI = apiOracle;
        pgSQLAPI = oracleAPI.replace("'", "''");
        pgSQLAPI = pgSQLAPI.replace("(''''||", "(''||");
        pgSQLAPI = pgSQLAPI.replace("||'''')", "||'')");
        return pgSQLAPI;
    }
}
