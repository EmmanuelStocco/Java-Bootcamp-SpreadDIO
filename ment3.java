class Main {
  public static void main(String[] args) {
    int x = 10;
    double y = x / 3;
    System.out.println(y);
  }
}

class Main {
  public static void main(String[] args) {
    int idade = 20, anoAtual = 2021;
    int anoNascimento = anoAtual - idade;
    System.out.println("O ano de nascimento é: " + anoNascimento);
  }
}

//Estrutura condicional
class Main {
  public static void main(String[] args) {

    int x = 1;
    int y = 10;

    if(x == 2 && y < 10){
      System.out.println("Condição A");
    } else if (x >= 3 || y <= 5) {
      System.out.println("Condição B");
    } else {
      System.out.println("Condição C");
    }
 
  }
}


//Estrutura de repetição 
//Enquanto
class Main {
  public static void main(String[] args) {
    int x = 10;
    while (x > 0){
      System.out.println(x);
      x--;
    }
  }
}


//FOR
class Main {
  public static void main(String[] args) {
    int x = 10;
    for (int i = 1; i <= 10; i++){
      System.out.println(i);
      System.out.println("o valor de x é " + x);
    }
  }
}


