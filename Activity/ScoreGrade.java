public class ScoreGrade {
    public static void main(String[] args) {
        int grade = 9;
        if (grade >=90){
            System.out.println("Your Grade is: A");   
        }else if (grade>=80 && grade <=89) {
            System.out.println("Your Grade is: B");    
        }else if (grade>=70 && grade <=79) {
            System.out.println("Your Grade is: C");    
        }else if (grade>=60 && grade <=69) {
            System.out.println("Your Grade is: D");    
        }else if (grade<60) {
            System.out.println("Your Grade is: F");    
        }else{
            System.out.println("invalid input!");
        }
    }
}

