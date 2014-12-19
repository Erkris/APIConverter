/**
 * Created by pierrerubier on 17/11/2014.
 */


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class APIConverter extends JFrame {

    private static JTextArea input;
    private JTextArea output;
    private JButton botToTop, convertSQLServer, convertPGSQL, convertOracle, convertOracleAPI;

    public APIConverter() {
        // Creation de notre fenetre principal
        super("API Converter");
        setSize(1024,700);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creation du top panel
        JPanel upperPanel = new JPanel();
        upperPanel.setSize(1024,250);

        // Creation du middle panel
        JPanel middlePanel = new JPanel();
        middlePanel.setSize(1024,100);

        // Creation du bottom panel
        JPanel lowerPanel = new JPanel();
        lowerPanel.setSize(1024, 250);

        getContentPane().add(upperPanel, "North");
        getContentPane().add(middlePanel, "Center");
        getContentPane().add(lowerPanel, "South");

        // Création du champ d'entrée
        input = new JTextArea(17,70);
        input.setLineWrap(true);
        upperPanel.add(new JScrollPane(input));

        // Creation du bouton pour envoyer de ouput vers input
        botToTop = new JButton("Bot To Top");
        middlePanel.add(botToTop);

        botToTop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String myRequest = output.getText();
                input.setText(myRequest);
            }
        });

        // Creation du bouton de convertion SQL Server
        convertSQLServer = new JButton("Oracle API to SQLServer API");
        middlePanel.add(convertSQLServer);

        convertSQLServer.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
               String myRequest = input.getText();
               OracleAPIToSQLServer oracleAPI = new OracleAPIToSQLServer();
               output.setText(oracleAPI.getSqlServerAPI(myRequest));
           }
        });

        // Creation du bouton de convertion PG SQL
        convertPGSQL = new JButton("Oracle API to PGSQL API");
        middlePanel.add(convertPGSQL);

        convertPGSQL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String myRequest = input.getText();
                OracleAPIToPGSQL oracleAPI = new OracleAPIToPGSQL();
                output.setText(oracleAPI.getPGSQLAPI(myRequest));
            }
        });

        // Creation du bouton de convertion Oracle API --> Oracle
        convertOracle = new JButton("Oracle API to Oracle");
        middlePanel.add(convertOracle);

        convertOracle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String myRequest = input.getText();
                OracleAPIToOracle oracleAPI = new OracleAPIToOracle();
                output.setText(oracleAPI.getOracle(myRequest));
            }
        });

        // Creation du bouton de convertion Oracle --> Oracle API
        convertOracleAPI = new JButton("Oracle to Oracle API");
        middlePanel.add(convertOracleAPI);

        convertOracleAPI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String myRequest = input.getText();
                OracleToOracleAPI oracle = new OracleToOracleAPI();
                output.setText(oracle.getOracleAPI(myRequest));
            }
        });

        // Création du champ de sortie
        output = new JTextArea(17,70);
        output.setLineWrap(true);
        lowerPanel.add(new JScrollPane(output));

        //f.pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new APIConverter();
    }
}