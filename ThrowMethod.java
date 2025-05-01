import java. io.*;

public class ThrowMethod {
  public static void main(String[] args){
    WriteFile wf = new WriteFile();
    try{
      wf.open();
      wf.write();
    }catch(IOException e){
      System.out.println("IOExseptionが発生しました");
      e.printStackTrace();
    }catch(Exception e){
      System.out.println("Exceptionが発生しました");
      e.printStackTrace();
    }finally{
      wf.close();
    }
  }
}
