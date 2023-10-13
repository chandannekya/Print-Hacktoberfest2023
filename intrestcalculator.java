import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;


public class Intrestcalculator {
    public static void main(String[] args) {
        try {
            Float principalamnt=new Float(0);
            Float rate=new Float(0);
            int numyear=0;

            BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
            String tempString;

            System.out.print("enter principal Amount : ");
            System.out.flush();
            tempString=b.readLine();
            principalamnt=Float.valueOf(tempString);
            System.out.print("Enter Rate of intrest : ");
           System.out.flush();
            
            tempString=b.readLine();
            
            rate=Float.valueOf(tempString);
            System.out.print("Enter the number of year : ");
            System.out.flush();
            tempString=b.readLine();
            numyear=Integer.parseInt(tempString);

            Float intrestTotal = (principalamnt*rate*numyear)/100;
            System.out.println("Total intrest : "+ intrestTotal);


        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
