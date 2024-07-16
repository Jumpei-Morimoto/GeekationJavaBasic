package objectExercise;

public class Property {
    private  String propertyName;
    private String name;
    private String type;
    private int price;
    private  String houseLayout;

    Property(String propertyName,String name,String type,int price,String houseLayout){
      this.propertyName = propertyName;
      this.name = name;
      this.type = type;
      this.price = price;
      this.houseLayout= houseLayout;
    }

    public String getPropertyName (){
      return this.propertyName;
    }
    public String getName (){
      return this.name;
    }
    public String getType (){
      return this.type;
    }
    public int getPrice (){
      return this.price;
    }
    public String getHouseLayout (){
      return this.houseLayout;
    }

    public void setPropertyName (String propertyName){
      this.propertyName = propertyName;
    }
    public void setName (String name){
      this.name = name;
    }
    public void setType (String type){
      this.type = type;
    }
    public void setPrice (int price){
      this.price = price;
    }
    public void setHouseLayout (String houseLayout){
      this.houseLayout = houseLayout;
    }

    public void  data(){
      System.out.println("============================="); 
      System.out.println("物件名:"+propertyName);
      System.out.println("物件所有者名:"+name);
      System.out.println("物件種別:"+type);
      System.out.println("物件価格:"+price+"円");
      System.out.println("間取り:"+houseLayout);
      System.out.println("=============================");
    }

}
