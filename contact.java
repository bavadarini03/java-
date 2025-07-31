import java.util.*;
class contact{
public static void main(String[] args){
ArrayList <String> con=new ArrayList<String>();
con.add("bava");
con.add("vasu");
con.add("hari");
con.add("nivi");
con.add("haji");
for(String con1:con){
System.out.println(con1);
}
System.out.println("retrived contact"+con.get(3));
System.out.println("updated contact"+con.set(0,"kannu"));
System.out.println("delete contact"+con.remove(3));
System.out.println("Final contact list"+con);
}
}
