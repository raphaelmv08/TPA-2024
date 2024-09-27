package java_06_09;
import java.util.*;
public class Idade {
	public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
      int id,menor=160,maior=1,faixa1=0,faixa2=0,faixa3=0,faixa4=0,faixa5=0,i=0;
      double calc=15;
      
      while (i<=14) {
    	  System.out.println("Digite a idade do usuario");
    	  id = ler.nextInt();
    	 
    	 
    	  
    	  if (id<=15) {
    		faixa1++;
    	    }
    	  
    	  else if (id<=30) {
    		  faixa2++;
    	    }
    	  
    	  else if (id<=45) {
    		  faixa3++;
    	    }
    	  
    	  else if (id<=60) {
    		  faixa4++;
    	    }
    	  
    	  else {
    		  faixa5++;
    	    } 
    	  
    	  if(menor>id) {
    		  menor=id;
    	  }
    	
    	  if(maior<id) {
    		  maior=id;
    	  }
    	  
      	  i++;
    	  }
      
      System.out.println("\nO número de pessoas em cada faixa etária é:");
      
      
      System.out.println("\nO número de pessoas na faixa etária até 15 anos é: " +faixa1+ ", A porcentagem de pessoas nessa faixa é: " +((faixa1*100)/calc)+ "%");
      System.out.println("O numero de pessoas na faixa etária dos 16-30 anos é: " +faixa2+ ", A porcentagem de pessoas nessa faixa é: " +((faixa2*100)/calc)+ "%");
      System.out.println("O numero de pessoas na faixa etária dos 31-45 anos é: " +faixa3+ ", A porcentagem de pessoas nessa faixa é: " +((faixa3*100)/calc)+ "%");
      System.out.println("O numero de pessoas na faixa etária dos 46-60 anos é: " +faixa4+ ", A porcentagem de pessoas nessa faixa é: " +((faixa4*100)/calc)+ "%" );
      System.out.println("O numero de pessoas na faixa etária acima dos 61 anos é: " +faixa5+ ", A porcentagem de pessoas nessa faixa é: " +((faixa5*100)/calc)+ "%");
      
      
      System.out.println("\nA menor idade é: " +menor);
      System.out.println("A maior idade é: " +maior);
      
      
        ler.close();
      }
	}