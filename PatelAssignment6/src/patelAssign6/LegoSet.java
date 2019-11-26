package patelAssign6;

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
              
              sb.append("Name:" + getName());
              sb.append(", ");
              sb.append("Set Num:" + getsetNum());
              sb.append(", ");
             
              return sb.toString();
       }
}

