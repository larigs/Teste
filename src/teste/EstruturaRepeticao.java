package teste;

import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {
		// criaçao de um vetor de numeros inteiros
		int vetInt[] = new int[10];
		Scanner entrada = new Scanner(System.in);
		// (tipo e declaraçao da variavel; condiçao; soma um a cada loop)
		for(int i=0; i<10; i++) {
			System.out.println("Digite um numero inteiro: ");
			// adicionando o valor de entrada no vetor na posiçao i
			vetInt[i] = entrada.nextInt();
		}
		entrada.close();
		for(int i=0; i<10; i++) {
			// o ln da uma quebra de linha, se tirar ele tudo será impresso na mesma linha
			if(i==8) {
				System.out.print(vetInt[i] + " e ");
			} else if(i==9){
				System.out.print(vetInt[i] + ".");
			} else {
				System.out.print(vetInt[i] + ", ");
			}
		}

	}

}

/*
*  while(condicao) {
*       // Comandos que devem ser executados
*  }
*
*  do{
*  		//Comandos que devem ser executados
*  } while (condicao);
*      
*
*
*
*
*/