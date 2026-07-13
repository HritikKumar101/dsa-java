public class Strings{
    public static void main(String[] args) {
        // String Declarition

        // String name ="Tony";
        // String fullName ="Tony Stark";
        // String sentence ="My name is Tony Stark";

        // input
        // Scanner sc = new Scanner(System.in);
        // String name =sc.nextLine();
        // System.out.println("Your name is "+ name);

        //important function in hava

        // concatenation 

        // String firstName ="Tonny";
        // String lastName ="Stark";
        // String fullName=firstName+" "+lastName;
        // System.out.println(fullName);

        // length

        // System.out.println(fullName.length());

        //charAt
        // for(int i=0;i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }

        // compare string 

        String name1="Tonny";
        String name2="Tonny";

        // s1 > s2 : +ve value
        // s1 == s2 : 0
        // s1 < s2 : -ve value
        // hello < wello because w is greather than h

        // if(name1.compareTo(name2)==0){
        //    System.out.println("String are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }


        // if(name1 == name2){
        //    System.out.println("String are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        //  if(new String("Tony") == new String("Tony")){
        //    System.out.println("String are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        //  == is not always correct for String comparision.

        // Substring

        String sentence ="My name is Tony";

        //substring(beg index, end index)

        // String name =sentence.substring(11,sentence.length());
        String name =sentence.substring(0,4);
        System.out.println(name);

        // String are immutable

        // Parsing in java 
        
        // String ot Int 
        String str= "123";
        int num = Integer.parseInt(str);
        System.out.println(num+10);

        // String to double
        String st = "12.5";
        double num2 = Double.parseDouble(st);

        System.out.println(num2);
 

    }
}