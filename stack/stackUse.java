public class stackUse{
    public static void main(String[] args) {
        stackImplement stack = new stackImplement();
       for(int i =0;i <= 5;i++){
           stack.push(i);
       }

       while(!stack.isEmpty()){
        System.out.println(stack.pop());
       }
    }
}