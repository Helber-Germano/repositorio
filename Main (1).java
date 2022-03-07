import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

class Main {
  
  static void question1() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o tamanho do vetor: ");
    int arraySize = scanner.nextInt();
    
    if (arraySize % 2 != 0) {
      int[] array = new int[arraySize];
      
      System.out.println("Digite os elementos do vetor: ");
      for(int i = 0; i < arraySize; i++) {
        array[i] = scanner.nextInt();
      }
  
      Arrays.sort(array);
      System.out.println("A mediana é: " + array[array.length/2]);
    }
    else {
      System.out.println("Só é permitido vetores com número impar de elementos");
    }
  }
  
  static void question2() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o tamanho do vetor: ");
    int arraySize = scanner.nextInt();
    int[] array = new int[arraySize];
    
    System.out.println("Digite os elementos do vetor: ");
    for(int i = 0; i < arraySize; i++) {
      array[i] = scanner.nextInt();
    }

    System.out.println("Digite X: ");
    int x = scanner.nextInt();

    int count = 0;
    for(int i = 0; i < array.length; i++) {
      for(int j = i; j < array.length; j++) {
        if(array[i] + x == array[j] || array[i] - x == array[j]) {
          count++;
        }
      }
    }

    System.out.println("Pares com diferença de " + x + ": " + count);
  }
  
  static void question3() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um texto para encriptar: ");
    String text = scanner.nextLine();
    text = text.replaceAll("\\s", "");

    int textSize = text.length();
    int sqrtTextSize = (int) Math.round(Math.sqrt(textSize));
    char[][] grid = new char[sqrtTextSize][sqrtTextSize];

    int y = 0;
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[i].length; j++) {
        if(y < textSize) {
          grid[j][i] = text.charAt(y);
          y++;
        }
        else {
          break;
        }
      }
    }

    System.out.print("O texto encriptado é: ");
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[i].length; j++) {
        System.out.print(grid[i][j]);
      }
      System.out.print(" ");
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while(true) {
      System.out.println();
      System.out.println("Escolha uma questão para rodar ou 0 para sair: ");
      int question = scanner.nextInt();
      
      switch (question) {
        case 1:
          question1();
          break;
        case 2:
          question2();
          break;
        case 3:
          question3();
          break;
        case 0:
          System.exit(1);
          break;
      }
    }
  }
}