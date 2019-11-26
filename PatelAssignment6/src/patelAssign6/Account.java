package patelAssign6;

public class Account {

       private String name;
       private int id;
       private int amt;
       private String type;

       public Account() {
       }

       public Account(String name, int id, int amt, String type) {
              this.name = name;
              this.amt = amt;
              this.id = id;
              this.type = type;
       }

       public int getAmt() {
              return amt;
       }

       public void setAmt(int amt) {
              this.amt = amt;
       }

       public int getId() {
              return id;
       }

       public void setId(int id) {
              this.id = id;
       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public String getType() {
              return type;
       }

       public void setType(String type) {
              this.type = type;
       }

       public String toString() {
              StringBuffer sb = new StringBuffer();
              sb.append("Account Details - ");
              sb.append("Name:" + getName());
              sb.append(", ");
              sb.append("Type:" + getType());
              sb.append(", ");
              sb.append("Id:" + getId());
              sb.append(", ");
              sb.append("Age:" + getAmt());
              sb.append(".");

              return sb.toString();
       }
}

