// defining a public class called IfElse
public class IfElse {
    // creating a main method
    public static void main(String[] args) {
        int score=45;  // declaration and initialization
    // starting if conditions
        if(score<50){
        System.out.println("fail");
    }
    else if(score>=50 && score<70){
        System.out.println("good");
    }
     else if(score>=70 && score<=100){
        System.out.println("very good");
     }
     else {
        System.out.println("invalid");
     }
    }
}
