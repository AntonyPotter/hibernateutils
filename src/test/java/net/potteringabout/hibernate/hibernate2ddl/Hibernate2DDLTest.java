/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.potteringabout.hibernate.hibernate2ddl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tone
 */
public class Hibernate2DDLTest {
  
  public Hibernate2DDLTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }
  
  @Test
  public void generateDDLTest() throws Exception {
    SchemaGenerator gen = new SchemaGenerator("net.potteringabout.hibernate.hibernate2ddl.beans");
    final String directory = "target/";
    gen.generate(SchemaGenerator.Dialect.MYSQL, directory);
   //gen.generate(SchemaGenerator.Dialect.ORACLE, directory);
    //gen.generate(SchemaGenerator.Dialect.HSQL, directory);
    //gen.generate(SchemaGenerator.Dialect.H2, directory);
  }
}
