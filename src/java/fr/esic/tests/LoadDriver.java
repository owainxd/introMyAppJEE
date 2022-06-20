package fr.esic.tests;

import fr.esic.dao.DataManager;
import java.sql.Connection;

public class LoadDriver {

    public static void main(String[] args) throws Exception {

        System.out.println("fr.esic.tests.LoadDriver.main()");
        
        Connection connexion = DataManager.getConnection();

        if (connexion == null) {
            System.out.println("not connected");
        } else {
            System.out.println(connexion.toString());
        }
    }
}