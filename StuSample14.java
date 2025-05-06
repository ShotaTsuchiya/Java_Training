public class StuSample14 {
  public static void main(String[] args){
    Student14 stu1 = new Student14("菅原");
    Student14 stu2 = new Student14("菅原");

    boolean result = stu1.equals(stu2);
    System.out.println(result);
    System.out.println(stu1);
  }
}
