/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.tests;

import fr.esic.dao.UserDao;
import fr.esic.model.User;

/**
 *
 * @author al-am
 */
public class TestInscription {
    public static void main(String[] args) throws Exception {
        
        String nom = "Tom"; 
        String prenom = "Jerry"; 
        String login = "jerry"; 
        String password = "123";
        User utilisateur = new User(nom, prenom, login, password);
        UserDao.insertionUser(utilisateur);
    }
}
