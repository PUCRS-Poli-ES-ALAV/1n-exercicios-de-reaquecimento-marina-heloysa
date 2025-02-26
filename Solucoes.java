public class Solucoes{

// Exercicio 1
public int multiRec(int a, int b){
    if (b == 0){
        return 0;
    }
    return a + multiRec(a, b-1);
}

// Exercicio 2
// Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
private static int exercicio2(int n1, int n2){

    if(n1 == 1 && n2 == 1){
        return 2;
    }
    if (n1 != 1){
        return 1 + exercicio2(n1 - 1, n2);
    }
    return 1 + exercicio2(n1, n2 - 1);
}

// Exercício 3
public int somaDiv(int n, int i){
    if (n == 0){
        return 0;
    }
    return n/i + somaDiv(n, i+1);
}

// Exercício 5


// Exercício 7
public int somaVet(int[] vet, int i){
    if (i == vet.length){
        return 0;
    }
    int soma = vet[i] + somaVet(vet, i+1);
    int produto = vet[i] * somaVet(vet, i+1);

    System.out.println("Soma: " + soma + " Produto: " + produto);
    return soma & produto;
}

public static void main(String [] args){
    System.out.println(exercicio2(3, 6));
}
}