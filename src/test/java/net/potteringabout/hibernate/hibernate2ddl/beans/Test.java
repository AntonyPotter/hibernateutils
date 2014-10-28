/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.potteringabout.hibernate.hibernate2ddl.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TEST")
public class Test {

 @Id
 @Column(name = "TEST_ID")
 @GeneratedValue
 private Long testId;

 @Column(name = "SUBJECT")
 private String subject;

 @Column(name = "MAX_MARKS")
 private String maxMarks;

 @Column(name = "MARKS_OBTAINED")
 private String marksObtained;

 @Column(name = "RESULT")
 private String result;

 @ManyToMany(mappedBy = "test")
 private Set<Student> student = new HashSet<Student>();

 public Test(String subject, String maxMarks, String marksObtained,
   String result) {
  this.subject = subject;
  this.maxMarks = maxMarks;
  this.marksObtained = marksObtained;
  this.result = result;

 }

 public String getSubject() {
  return subject;
 }

 public void setSubject(String subject) {
  this.subject = subject;
 }

 public Long getTestId() {
  return testId;
 }

 public void setTestId(Long testId) {
  this.testId = testId;
 }

 public String getMaxMarks() {
  return maxMarks;
 }

 public void setMaxMarks(String maxMarks) {
  this.maxMarks = maxMarks;
 }

 public String getMarksObtained() {
  return marksObtained;
 }

 public void setMarksObtained(String marksObtained) {
  this.marksObtained = marksObtained;
 }

 public String getResult() {
  return result;
 }

 public void setResult(String result) {
  this.result = result;
 }

 public Set<Student> getStudent() {
  return student;
 }

 public void setStudent(Set<Student> student) {
  this.student = student;
 }

}

