import java.util.Scanner;

public class Meninos_Meninas{
	public static void main(String args[]){
		
		Scanner leia= new Scanner(System.in);
		int AM, AF, Total, PORM, PORF;
		
		System.out.println("Digita o numero de alunos do sexo masculino.");
		AM=leia.nextInt();
		
		System.out.println("Digita o numero de alunos do sexo feminino.");
		AF=leia.nextInt();
		
		Total= AM+AF;
		PORM= ((AM*100)/Total);
		PORF= ((AF*100)/Total);
		
        System.out.println("A porcentagem de meninos e meninas é:" + PORM );
        
	}
	ler.close ();
}
