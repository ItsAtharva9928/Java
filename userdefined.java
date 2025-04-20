import java.util.Scanner;
class NotMatchException extends Exception{
    NotMatchException(){
        System.out.println("Does not match");
    }
}
public class userdefined{
    public static void main(String[] args) {
        try{
            String name;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter India:");
            name = s.nextLine();
            if(name.equals("India")){
                System.out.println("Correct");
            }
            else{
                throw new NotMatchException();
            }
        }
        catch(NotMatchException e){ }
    }
}