# Palindr
import java.io.*;
import java.util.*;
 import java.lang.*;

public class Palin{  
 
public static void main(String[] args)throws IOException {
 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
str=br.readLine();
String revstring="";
 
for(int i=str.length()-1;i>=0;--i){
revstring +=str.charAt(i);
}
 
System.out.println(revstring);
 
if(revstring.equalsIgnoreCase(str)){
System.out.println("The string is Palindrome");
}
else{
System.out.println("Not Palindrome");
}
 
}
}
