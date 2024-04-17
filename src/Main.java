public class Main {
  public static void main(String[] args) {
//    double d = 8.5 / 2;
//    long l = 5 + 2L;
//    System.out.println(d);
//    System.out.println(l);
//    String msg = "私の年齢は" + 23;
//    System.out.println(msg);

//    int a = 5;
//    int b = 3;
//    int m = Math.max(a, b);
//    System.out.println("比較実験：" + a + "と" + b + "とで大きい方は・・・" + m);
//    String age = "31";
//    int n = Integer.parseInt(age);
//    System.out.println(
//            "あなたは来年、" + (n + 1) +"際になりますね。"
//    int r = new java.util.Random().nextInt(90
//    );
////    System.out.println(r + "歳ですね");
//    System.out.println("名前入力");
//    String name = new java.util.Scanner(System.in).nextLine();
//    System.out.println("年齢入力");
//    int age = new java.util.Scanner(System.in).nextInt();
//    System.out.println("ようこそ" + age + "歳の" + name + "さん。");
//    int x = 5;
//    int y = 10;
//    String ans = "x+yは" + (x + y);
//    System.out.println(ans);
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    int ageString = new java.util.Scanner(System.in).nextInt();
    int fortune = new java.util.Random().nextInt(3);
    fortune ++;
    System.out.println(ageString + "歳の" + name + "さん、あなたの運気番号は"+fortune+"です。" );
    System.out.println("1：大吉　2：中吉　3：吉　4：凶");
  }
}