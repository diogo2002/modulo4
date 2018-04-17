package oi;
import java.util.Scanner;
public class classificação {

	public static void main(String[] args) {
		 int N, M;Scanner LerS= new Scanner(System.in);
	        char[] chave={'a', 'b' };
	        int[] cotacao={1, 2};
	        M=chave.length;
	        System.out.print("Quantos alunos há?");
	        N=LerS.nextInt();
	        char[][] Resp= new char[N][M];
	        int[] Final=new int[N];
	        for(int i=0; i<N;i++)
	        for(int j=0;j<M;j++)
	        {System.out.printf("Resposta do aluno %d à pergunta %d?",i+1, j+1 );
	        Resp[i][j]=LerS.next().charAt(0);}
	        for(int i=0;i<N;i++)
	        {Final[i]=0;
	        for(int j=0;j<M;j++)
	        if (Resp[i][j]== chave[j])
	        Final[i]+=cotacao[j];}
	        System.out.printf("\n %6s %s\n", "aluno","classificação");
	        for(int i=0; i<N;i++)
	        System.out.printf("%4d %8d\n", i+1, Final[i]);
	}}
	        
	            
	        

