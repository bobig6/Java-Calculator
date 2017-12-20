import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String c1="";
            double a1= Double.parseDouble(scanner.nextLine());
        double result=a1;
        do {
            c1 = scanner.nextLine();
            if(!c1.equals("=")) {

                a1= Double.parseDouble(scanner.nextLine());
            }
            switch (c1){
                case "+":
                    result+=a1;
                    break;
                case "-":
                    result-=a1;
                    break;
                case "*":
                    result*=a1;
                    break;
                case "/":
                    result/=a1;
                    break;
                case "%":
                    result=result%a1;
                    break;
                case "step":
                    result=Math.pow(result,a1);
                    break;
                case "fib":
                    int f1=1;
                    int f2=1;
                    for (int i = 0; i < a1-1; i++) {
                        int temp = f1 + f2;
                        f1=f2;
                        f2=temp;

                    }
                    System.out.println(f2);
                    break;
                case "=":
                    break;
                default:
                    System.out.printf("Error!");
                    break;
            }
        }while(!c1.equals("="));
        System.out.println(result);
    }
}
