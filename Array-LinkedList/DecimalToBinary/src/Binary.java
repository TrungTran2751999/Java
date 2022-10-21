import java.util.Stack;

public class Binary {
   private int number;
   private Stack<Integer> mainStack;
   public void toBinary(int number){
       Stack<Integer> stack = new Stack<>();
       mainStack = new Stack<>();
       do{
           int soDu = number / 2;
           stack.add(soDu);
           number = soDu;
       }while (number / 2 !=0);
       stack.add(0);
       for(int i=0; i < stack.size(); i++){
           if(stack.get(i) % 2 ==0){
               mainStack.add(1);
           }else{
               mainStack.add(0);
           }
       }
   }
   public int size(){
       return mainStack.size();
   }
   public int get(int index){
       return mainStack.get(index);
   }
   public Stack<Integer> getMainStack(){
       return mainStack;
   }
}
