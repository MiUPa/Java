public class Main3 {
  public static void main(String[] args) {
//    int seibutsu = 0;
//    int age = 10;
//    System.out.println("こんにちは。");
//    if(seibutsu == 0){
//      System.out.println("私は男です。");
//      System.out.println(age + "歳です。");
//    }else{
//      System.out.println("私は女です。");
//    }
//    System.out.println("よろしくお願いします。");

//    System.out.println("[メニュー]1：検索　2：登録　3：削除　4：変更>");
//    int selected = new java.util.Scanner(System.in).nextInt();
//    switch(selected) {
//      case 1:
//        System.out.println("検索します");
//        break;
//
//      case 2:
//        System.out.println("登録します");
//        break;
//
//      case 3:
//        System.out.println("削除します");
//        break;
//
//      case 4:
//        System.out.println("変更します");
//        break;
//    }

//    練習3-6
    System.out.println("【数当てゲーム】");
    int ans = new java.util.Random().nextInt(9);
    for(int i = 0; i < 5; i ++){
      System.out.println("0〜9の数字を入力してください。");
      int num = new java.util.Scanner(System.in).nextInt();
      if(num==ans){
        System.out.println("アタリ！");
        break;
      }else{
        System.out.println("違います");
      }
    }
    System.out.println("ゲームを終了します");
  }
}
