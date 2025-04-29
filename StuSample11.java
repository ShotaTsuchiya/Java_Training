public interface StuSample11 {
  public static void main(String[] args){
    TandF taf = new TandF("陸上競技部");
    Football fb = new Football("サッカー部");

    Student11 stu1 = new Student11("菅原", taf);
    stu1.display();
    stu1.practice();

    Student11 stu2 = new Student11("櫻井", fb);
    stu2.display();
    stu2.practice();
  }
}
