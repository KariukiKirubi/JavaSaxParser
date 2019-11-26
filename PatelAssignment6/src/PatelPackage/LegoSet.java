package PatelPackage;

/*******************
Akashkumar Patel
CSCI 3020 Section W1
Fall 2019
Assignment 6
This program does ......
*******************/ 

import patelAssign6.*;

public class LegoSet {

       private String name;
       private String setNum;
       
       public LegoSet() {
       }

       public LegoSet(String name, String setNum) {
              this.name = name;
              this.setNum = setNum;
       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public String getsetNum() {
              return setNum;
       }

       public void setsetNum(String setNum) {
              this.setNum = setNum;
       }

       public String toString() {
              StringBuffer sb = new StringBuffer();
              
              sb.append("Set Num: " + getsetNum());
              sb.append("\n");
              sb.append("Name: " + getName());
             
             
              return sb.toString();
       }
}

