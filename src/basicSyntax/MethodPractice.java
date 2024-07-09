package basicSyntax;

public class MethodPractice {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int a =10;
        int b =20;
        method5(method1(a,b));
        method5(method2(a,b));
        method5(method3(a,b));
        method5(method4(a,b));
    }
        public static int method1(int num1, int num2){
          int cul1 = num1+num2;
          return cul1;  
        }

        public static int method2(int num1, int num2){
          int cul2 = num1-num2;
          return cul2 ;  
        }

        public static int method3(int num1, int num2){
          int cul3 = num1*num2;
          return cul3 ;  
        }

        public static int method4(int num1, int num2){
          int cul4 = num2/num1;
          return cul4 ;  
        }
        public static void method5(int a){
          System.out.println("計算結果は"+a+"です。");
        }
}