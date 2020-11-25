import java.util.Random;
class Toss {
   public String chanceFunc() {
      Random r = new Random();
      int chance = r.nextInt(4);
      if (chance == 1) {
         return"tails";
      } else {
         return"heads";
      }
   }
}
class Demo {
   public static void main(String[] args) {
      Toss t = new Toss();
      int heads = 0;
      int tails = 0;
      int chances = 10;
      for (int i = 1; i<= chances; i++) {
         if (t.chanceFunc().equals("tails")) {
            tails++;
         } else {
            heads++;
         }
      }
      System.out.println("Chances = " + chances);
      System.out.println("Heads: " + heads);
      System.out.println("Tails: " + tails);
   }
}


