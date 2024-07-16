package objectExercise;

public class Land extends Property{
  Land(String propertyName,String name,String type,int price,String houseLayout){
    super(propertyName,name,type,price,houseLayout);
  }
  public void  data(){
	  System.out.println("=============================");
        System.out.println("物件名:"+getPropertyName());
        System.out.println("物件所有者名:"+getName());
        System.out.println("物件種別:"+getType());
        System.out.println("物件価格:"+getPrice()+"円");
        System.out.println("広さ:"+getHouseLayout());
        System.out.println("=============================");
  }
}
