public class Student5{
  private String name;
  private int engScore;

  public Student5(String n){
    name = n;
  }
  public void setScore(int s){
    if (0 <= s && s <= 100){
      engScore = s;
    } else{
      System.out.println(name + "さんの点数が範囲外です");
    }
  }
  void display(){
    System.out.println(name + "さん" + engScore + "点");
  }
}