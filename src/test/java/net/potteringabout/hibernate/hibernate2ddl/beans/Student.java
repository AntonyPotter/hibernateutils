/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.potteringabout.hibernate.hibernate2ddl.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

 @Id
 @Column(name = "STUDENT_ID")
 @GeneratedValue
 private Long studentId;

 @Column(name = "FIRSTNAME")
 private String firstname;

 @Column(name = "LASTNAME")
 private String lastname;

 @Column(name = "EMAIL")
 private String email;

 @Column(name = "PHONE")
 private String phone;

 @ManyToMany(cascade = { CascadeType.ALL })
 @JoinTable(name = "STUDENT_TEST", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "TEST_ID") })
 private Set<Test> test = new HashSet<Test>();

 public Student() {
 }

 public Student(String firstname, String lastname, String email, String phone) {
  this.firstname = firstname;
  this.lastname = lastname;
  this.email = email;
  this.phone = phone;
 }

 @Override
 public boolean equals(Object emp) {
  if (emp instanceof Student) {
   Student student = (Student) emp;

   if (this.firstname.equals(student.getFirstname())
     && this.lastname.equals(student.getLastname())
     && this.email.equals(student.getEmail())
     && this.phone.equals(student.getPhone()))
    return true;
  }

  return false;
 }

 @Override
 public int hashCode() {

  return this.firstname.hashCode() + this.lastname.hashCode()
    + this.email.hashCode() + this.phone.hashCode();
 }

 public String getFirstname() {
  return firstname;
 }

 public void setFirstname(String firstname) {
  this.firstname = firstname;
 }

 public String getLastname() {
  return lastname;
 }

 public void setLastname(String lastname) {
  this.lastname = lastname;
 }

 public Long getStudentId() {
  return studentId;
 }

 public void setStudentId(Long studentId) {
  this.studentId = studentId;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }

 public Set<Test> getTest() {
  return test;
 }

 public void setTest(Set<Test> test) {
  this.test = test;
 }
}

