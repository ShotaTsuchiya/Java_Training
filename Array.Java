class Array{
  public static void main (String[] args){
    int[] score = new int[3]; //newは初期値
    score[0] = 80;
    score[1] = 100;
    score[2] = 75;

    int[][] allScore = new int[2][2]; //多次元配列
    allScore[0][0] = 100;
    allScore[0][1] = 200;
    allScore[1][0] = 300;
    allScore[1][1] = 400;

    String[] name = {"土屋", "佐久間", "吉野"};

    System. out. println(name[0] + "さん：" + score[0] + "さん");
    System. out. println(name[1] + "さん：" + score[1] + "さん");
    System. out. println(name[2] + "さん：" + score[2] + "さん");
    System. out. println("受験者数"+ score.length + "名");

    System. out. println(allScore.length);
    System. out. println(allScore[1].length);
  }
}