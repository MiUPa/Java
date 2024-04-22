public class Main4 {
  public static void main(String[] args) {
//    int [] score = new int[5];
//    int kobakos = score.length;
//    System.out.println("要素の数：" + kobakos);
//
//    int[] score = {20, 30, 40, 50, 80};
//    for (int value : score) {
//      System.out.println(value);
//    int[] points = new int[5];
//    double[] weights = new double[5];
//    boolean[] answers = new boolean[3];
//    String[] names = new String[3];
//    System.out.println(points);
//    int[] moneyList = {121902, 8032, 55100};
//    for (int money: moneyList) {
//      System.out.println(money);
//    }
    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();

    for(int n: numbers){
      if(input == n){
        System.out.println("アタリ！");
      }
    }
  }
}
