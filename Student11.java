public class Student11 {
  private String name;
  private Club club;

  public Student11(String name, Club club){
    this.name = name;
    this.club = club;
  }
  public void display(){
    System.out.println("名前：" + name);
    club.display();
  }
  public void practice(){
    club.practice();
  }
}
