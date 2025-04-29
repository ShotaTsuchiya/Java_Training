public class StuSample10 {
  public static void main(String[] args){
    Student10 stu1 = new Student10("菅原", 1);
    Person5 psn = stu1;
    psn.display();

    if(psn instanceof Student10){
      Student10 stu2 = (Student10)psn;
      stu2.chgStuNo(1001);
      stu2.display();
    }
  }
}
