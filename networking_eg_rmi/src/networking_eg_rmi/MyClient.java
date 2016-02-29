package networking_eg_rmi;
import java.rmi.*;  
public class MyClient{  
public static void main(String args[]){  
try{  
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000");  
System.out.println(stub.add(34,4));  
}catch(Exception e){}  
}  
}  