public class StringBuilders{
    public static void main(String[] args){
        
        // Strings are immuatable in java
          
          StringBuilder sb = new StringBuilder("Tony");
          System.out.println(sb);

          // char at index 0
          System.out.println(sb.charAt(0));

          // set char at index 0
          sb.setCharAt(0,'p');
          System.out.println(sb);

          // insert function

          sb.insert(2,'n');
          System.out.println(sb);

          // delete

          sb.delete(2,3);
          System.out.println(sb);

          // append 
          sb.append("Stark");
          System.out.println(sb);
          System.out.println(sb.length());


          String s = "hello";
          StringBuilder sd = new StringBuilder();
          for(int i= 0;i<s.length();i++){
             sd.append(s.charAt(i));
          }

          System.out.println(sd.reverse());


    }

}