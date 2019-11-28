package PatelAssign6;

/*******************
Akashkumar Patel
CSCI 3020 Section W1
Fall 2019
Assignment 6
This program does ......
*******************/ 

//This is getter and setter class of to get and set the name and the set number
public class LegoSet {

       private String name;
       private String setNum;
      
       //Constructer for the class
       public LegoSet() {
       }
       
//Override the constructer
       public LegoSet(String name, String setNum) {
              this.name = name;
              this.setNum = setNum;
       }
       
       
       //getter method to get the name
       public String getName() {
              return name;
       }
       
       //Setter method to set the name

       public void setName(String name) {
              this.name = name;
       }
       
       
       //Getter method to det the setNumber
       public String getsetNum() {
              return setNum;
       }
       
       //Setter method to set the number
       public void setsetNum(String setNum) {
              this.setNum = setNum;
       }
       
       //Method to convert the data to readable format, e.e string
       public String toString() {
              StringBuffer sb = new StringBuffer();
              
              sb.append("Set Num: " + getsetNum());
              sb.append("\n");
              sb.append("Name: " + getName());
             
             
              return sb.toString();
       }
}

