/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.dao;

import fr.esic.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author al-am
 */
public class UserDao {

    public static User getByLoginAndPassword(String pLogin, String pPassword) throws Exception {

        User utilisateur = null;

        // String sql = "SELECT * FROM users WHERE login=" + pLogin + " AND password=" + pPassword;
        String sql = "SELECT * FROM users WHERE login=? AND password=?";

        Connection connexion = DataManager.getConnection();

        /* Statement request = connexion.createStatement();
        ResultSet resultat = request.executeQuery(sql);
         */
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, pLogin);
        prepare.setString(2, pPassword);
        ResultSet resultat = prepare.executeQuery();
        
        /* si la combinaison login + password existe dans la BDD on crée un objet 
        de type utilisateur. 
         on remplit tous les champs        
         */
        if (resultat.next()) {

            // System.out.println("you are connected");
            utilisateur = new User();

            utilisateur.setId(resultat.getInt("id"));
            utilisateur.setNom(resultat.getString("nom"));
            utilisateur.setPrenom(resultat.getString("prenom"));
            utilisateur.setLogin(resultat.getString("login"));
        }
        return utilisateur;
    }
    
    
    public static void insertionUser(User utilisateur) throws Exception{
        
        // INSERT INTO users (nom, prenom, login, password) VALUES ("had", "hamza", "hamza", "123");
        
        String sql = "INSERT INTO users (nom, prenom, login, password) VALUES (?, ?, ?, ?)";
        
        Connection connexion = DataManager.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, utilisateur.getNom());
        prepare.setString(2, utilisateur.getPrenom());
        prepare.setString(3, utilisateur.getLogin());
        prepare.setString(4, utilisateur.getPassword());
     
        prepare.execute();           
       
    }
    
    public static List<User> getAll() throws Exception{
        
        List<User> users = new ArrayList<>(); 
        String sql = "SELECT * FROM users";
        
        Connection connexion = DataManager.getConnection();
        Statement requete = connexion.createStatement();
        ResultSet resultat = requete.executeQuery(sql);
        
        while(resultat.next()){
            
            User utilisateur = new User();
            utilisateur.setId(resultat.getInt("id"));
            utilisateur.setNom(resultat.getString("nom"));
            utilisateur.setPrenom(resultat.getString("prenom"));
            utilisateur.setLogin(resultat.getString("login"));
     
            // on ajoute l'utilisateur lu dans la liste users
            users.add(utilisateur);
        }
       
        return users; 
    }
}