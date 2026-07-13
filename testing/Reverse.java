import java.util.*;
public class Reverse{
public static void main(String[] args){
    String str = "runjavacodewithoutvscode";
    // String rev="";
    // for(int i =str.length()-1;i>=0;i--){
    //   rev += str.charAt(i);
    // }
    // System.out.println(rev);
    
    // Method -2
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<str.length();i++){
    sb.append(str.charAt(i));
  }
  
    System.out.println(sb.reverse());
  
  }
  }
