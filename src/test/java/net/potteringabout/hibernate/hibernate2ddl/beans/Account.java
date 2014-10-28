/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.potteringabout.hibernate.hibernate2ddl.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 *
 * @author tone
 */
@Entity
public class Account implements Serializable {
 
    @Id
    @GeneratedValue
    private Long id;
    @Version
    private Long version;
    private String username;
    private String password;
    private String email;
 
    //getters and setters
}
