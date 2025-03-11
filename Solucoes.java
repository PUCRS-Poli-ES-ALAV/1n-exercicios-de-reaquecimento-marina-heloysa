public class Solucoes{

// Exercicio 1
// Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
private static int multiRec(int a, int b){
    if (b == 0){
        return 0;
    }
    return a + multiRec(a, b-1);
}

// Exercicio 2
// Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
private static int exercicio2(int n1, int n2){

    if(n1 == 0 && n2 == 0){
        return 0;
    }
    if (n1 != 0){
        return 1 + exercicio2(n1 - 1, n2);
    }
    return 1 + exercicio2(n1, n2 - 1);
}

// Exercício 3
// Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.


// Exercício 4
// Inversão de uma string
private static String inverteString(String a){
    if (a.length() == 1){
        return a;
    }
    return a.charAt(a.length() - 1) + inverteString(a.substring(0, a.length() - 1));
}

// Exercício 5
// Gerador da sequência dada por:
// F(1) = 1
// F(2) = 2
// F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2)
private static int funcao(int n){
    if (n == 1){
        return 1;
    }
    else if (n == 2){
        return 2;
    }
    else if (n > 0){
        return 2 * (funcao(n - 1) + 3) * (funcao(n - 2));
    }
    else { return 0; }
}

// Exercicio 6
// A(m, n) = n + 1, se m = 0
// A(m, n) = A(m − 1, 1), se m != 0 e n = 0
// A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0
private static int ackerman(int m, int n){
    if (m > n){
        return ackerman(n, m);
    }
    if (m == 0){
        return n + 1;
    }
    else if (m != 0 && n == 0){
        return ackerman(m - 1, 1);
    }
    return ackerman((m - 1), ackerman(m, n - 1)); 

}

// Exercício 7
private static int somaVet(int[] vet, int i){
    if (i == vet.length){
        return 0;
    }
    int soma = vet[i] + somaVet(vet, i+1);
    int produto = vet[i] * somaVet(vet, i+1);

    return soma & produto;
}

public static void main(String [] args){

    System.out.println("\nExercicio 1:");
    System.out.println("a 5 b 4");
    System.out.println(multiRec(5, 4));

    System.out.println("\nExercicio 2:");
    System.out.println("n1 3 n2 2");
    System.out.println(exercicio2(3, 2));

    System.out.println("\nExercicio 4:");
    System.out.println("string 'hello'");
    System.out.println(inverteString("hello"));

    System.out.println("\nExercicio 5");
    System.out.println("n 5");
    System.out.println(funcao(5));

    System.out.println("\nExercicio 6");
    System.out.println("m 5 n 3");
    System.out.println(ackerman(5, 3));

    System.out.println("\nExercicio 7:");
    int[] vet = {1, 2, 3, 4, 5};
    System.out.println("vet {1, 2, 3, 4, 5}");
    System.out.println(somaVet(vet, 0));
}
}