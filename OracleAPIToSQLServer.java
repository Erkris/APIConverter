/**
 * Created by pierrerubier on 18/11/2014.
 */
public class OracleAPIToSQLServer {
    private String oracleAPI;
    private String sqlServerAPI;

    public OracleAPIToSQLServer() {
    }

    public String getSqlServerAPI(String apiOracle) {
        oracleAPI = apiOracle;
        sqlServerAPI = oracleAPI.replace("JOIN ", "JOIN THESORIMED.");
        sqlServerAPI = sqlServerAPI.replace("FROM ", "FROM THESORIMED.");
        sqlServerAPI = sqlServerAPI.replace("||", "+");
        sqlServerAPI = sqlServerAPI.replace("('+", "('+@");
        sqlServerAPI = sqlServerAPI.replace("+'')", "+')");
        return sqlServerAPI;
    }
}
