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
public class TestConnexion {

    public static void main(String[] args) throws Exception {
        String pLogin = "owain";
        String pPassword = "123";
        User u = UserDao.getByLoginAndPassword(pLogin, pPassword);
        System.out.println("Hello " + u.getNom() + " " + u.getPrenom());
    }
}
