package practice.homework;

public class ChessBoard {
  public static void main(String[] args) {

      for(int i=1;i<=8;i++){

          for(int j=1;j<=8;j++)
          {
              if((i + j)% 2 == 0)
              {
                  System.out.format(" ♥ ");;}
              else
              {
                  System.out.format(" ♡ ");; }

          }
          System.out.println();
      }
  }
}