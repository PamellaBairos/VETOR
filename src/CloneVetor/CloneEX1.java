package CloneVetor;

import java.util.Scanner;

public class CloneEX1 {
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int n;
		 System.out.println("não devem ser digitados mais de 10 numeros");
		 do {
			 int i;
			 System.out.println("quantos numeros deseja digitar");
			 n = sc.nextInt();
			 int vet[] = new int [n];
			 while(n<=10) {
			 for( i= 0; i<vet.length; i++) 
			 {
				 vet [i]= sc.nextInt();	
			 }
			 for( i= 0; i<vet.length; i++) {		 
				 if(vet[i]<0) 
				 {
					 System.out.println(vet[i]);
				 }		 
			 }	
			 
			 } 
		 }while(n>10);
		 sc.close();
	 }
}
