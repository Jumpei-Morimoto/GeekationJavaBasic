package basicSyntax;

public class ComparisonLogicalOperators {

    public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
     int a = 10;
     int  b =5;
     boolean isEqualA =(a > b);
     System.out.println(isEqualA);

     String tenki ="晴れ";
     String kion ="暖かい";

     boolean isSunny = (tenki=="晴れ");
     boolean isWarm =(kion=="暖かい");

     System.out.println(isSunny==true && isWarm==true);

     int x = 5;
     int y = 6;

     System.out.println(x >= 0 && y % 2 == 0 );

     boolean hasPermission = false;
     System.out.println(hasPermission==false);  
    }
}
