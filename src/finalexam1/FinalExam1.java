package finalexam1;

public class FinalExam1 {

    public static void main(String[] args) {
        System.out.println(calculateAverage(12.3, 68.9, 50));
    }
    
    public static double calculateAverage(double num1, double num2, double num3)
    {
        
        double average = Math.round(((num1 + num2 + num3) / 3) * 100) / 100.0;
        
        return average;
    }
    
}
